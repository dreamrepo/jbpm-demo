package org.foreveross.jbpm.jbpmDemo.web.action.jbpm;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.struts2.ServletActionContext;
import org.foreveross.jbpm.jbpmDemo.application.FormApplication;
import org.foreveross.jbpm.jbpmDemo.application.vo.FormTaskVo;
import org.foreveross.jbpm.jbpmDemo.application.vo.FormVO;
import org.foreveross.jbpm.jbpmDemo.application.vo.MessageLogVO;
import org.foreveross.jbpm.util.XmlParseUtil;
import org.foreveross.jbpm.wsclient.HistoryLogVo;
import org.foreveross.jbpm.wsclient.JBPMApplication;
import org.foreveross.jbpm.wsclient.JBPMApplicationImplService;
import org.foreveross.jbpm.wsclient.JbpmNode;
import org.foreveross.koala.auth.ss3adapter.AuthUserUtil;

import com.dayatang.domain.InstanceFactory;

public class JbpmFromAction {
	
	
	private JBPMApplication jbpmApplication;
	
	private JBPMApplication getJBPMApplication() {
		if(jbpmApplication==null){
			jbpmApplication = JBPMApplicationImplService.getJBPMApplication();
		}
		return jbpmApplication;
	}
	
	
	@Inject
	private FormApplication formApplication;
	
	private List<HistoryLogVo> logs;
	
	private int result;
	
	private List<FormVO> vos;
	
	private FormVO vo;
	
	private long id;
	
	private String formId;
	
	private List<FormTaskVo> formTasks;
	
	private long taskId;
	
	private int status;
	
	private long processId;
	
	private String comment;
	
	private String resu;
	
	private String actualName;
	
	private List<MessageLogVO> messages;
	
	private List<JbpmNode> nodes;
	
	private String targetUser;
	
	private String processImage;
	/**
	 * 
	 * 
	 * 查询待办任务
	 * @return
	 */
	public String list(){
		vos = formApplication.queryAll();
		return "list";
	}
	
	/**
	 * 移除某表单
	 * @return
	 */
	public String remove(){
		//
		return "list";
	}
	
	/***
	 * 新增一个表单
	 * @return
	 */
	public String add(){
		formApplication.updateFormVO(vo);
		return list();
	}
	
	/**
	 * 查看某表单详情
	 * @return
	 */
	public String view(){
		vo = formApplication.getFormVO(id);
		return "apply";
	}
	
	public String message(){
		String user = AuthUserUtil.getLoginUserName();
		messages = this.formApplication.getMessages(user);
		return "message";
	}
	
	public String doneList(){
		String user = AuthUserUtil.getLoginUserName();
		formTasks = formApplication.getFormDoneTaskVo(user);
		return "donelist";
	}
	
	public String todoList(){
		String user = AuthUserUtil.getLoginUserName();
		formTasks = formApplication.getFormTaskVo(user);
		return "todolist";
	}
	
	//流程相关
	public String createProcess(){
		String creater = AuthUserUtil.getLoginUserName();

		String hasZlQyjl = null;// 是否有助理区域经理

		String hasQyjl = null;// 是否有区域经理

		String hasQyzj = null;// 是否有总监
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("formId", String.valueOf(formId));
		params.put("comment", "Created");
		params.put("creater", creater);
		if (creater.equals("abc")) {
			hasZlQyjl = "0";
			hasQyjl = "0";
			hasQyzj = "1";
		}
		if (creater.equals("aaa")) {
			hasZlQyjl = "0";
			hasQyjl = "0";
			hasQyzj = "0";
		}
		if (creater.equals("bbb")) {
			hasZlQyjl = "1";
			hasQyjl = "1";
			hasQyzj = "1";
		}
		params.put("hasZlQyjl", hasZlQyjl);
		params.put("hasQyjl", hasQyjl);
		params.put("hasQyzj", hasQyzj);
		params.put("user", creater);
		params.put("result", "流程启动");
		
		long id = getJBPMApplication().startProcess("defaultPackage.Trade", XmlParseUtil.paramsToXml(params));
		result = 1;
		return "json";
	}
	
	
	//分行经理审批相关 
	public String fhjlApproveStatus(){
		String user = AuthUserUtil.getLoginUserName();
		Map<String, Object> data = new HashMap<String,Object>();
		data.put("approveStatus",String.valueOf(status));
		data.put("user", user);
		data.put("comment", comment);
		data.put("result", resu);
		getJBPMApplication().completeTask(processId, taskId, user, XmlParseUtil.paramsToXml(data), null);
		result = 1;
		return "json";
	}
	
	
	public String detail(){
		//查询表单数据
		vo = formApplication.getFormVO(Long.parseLong(formId));
		logs = getJBPMApplication().queryHistoryLog(processId);
		//查询历史记录
		return "detail";
	}
	
	public String doneDetail(){
		//查询表单数据
		vo = formApplication.getFormVO(Long.parseLong(formId));
		logs = getJBPMApplication().queryHistoryLog(processId);
		return "doneDetail";
	}
	
	public String queryNodes(){
		//nodes = getJBPMApplication().getProcessNodes(processId);
		return "nodeJson";
	}
	
	public String allProcesses(){
		//jbpmApplication.assignToNode(Integer.parseInt(formId),8);
		//this.processes = jbpmApplication.queryAllActiveProcess();
		this.formTasks = this.formApplication.queryActiveFormVo();
		return "process";
	}
	
	public String delegate(){
		String user = AuthUserUtil.getLoginUserName();
		if(user.equals(targetUser))return "json";
		result = 1;
		getJBPMApplication().delegate(taskId, user, targetUser);
		return "json";
	}
	
	
	public String assignNode(){
		getJBPMApplication().assignToNode(processId, id);
		result = 1;
		return "json";
	}
	
	public String errorList(){
		formTasks = this.formApplication.getErrorList();
		return "errorList";
	}
	
	public String repair(){
		getJBPMApplication().repairTask(this.taskId);
		result = 1;
		return "json";
	}

	public FormVO getVo() {
		return vo;
	}

	public void setVo(FormVO vo) {
		this.vo = vo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

	public List<FormVO> getVos() {
		return vos;
	}

	public void setVos(List<FormVO> vos) {
		this.vos = vos;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getProcessId() {
		return processId;
	}

	public void setProcessId(long processId) {
		this.processId = processId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getResu() {
		return resu;
	}

	public void setResu(String resu) {
		this.resu = resu;
	}

	public List<HistoryLogVo> getLogs() {
		return logs;
	}

	public void setLogs(List<HistoryLogVo> logs) {
		this.logs = logs;
	}

	public String getActualName() {
		return actualName;
	}

	public void setActualName(String actualName) {
		this.actualName = actualName;
	}

	public List<MessageLogVO> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageLogVO> messages) {
		this.messages = messages;
	}

	public List<FormTaskVo> getFormTasks() {
		return formTasks;
	}

	public void setFormTasks(List<FormTaskVo> formTasks) {
		this.formTasks = formTasks;
	}

	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

	public String getProcessImage() {
		return processImage;
	}

	public void setProcessImage(String processImage) {
		this.processImage = processImage;
	}

	public List<JbpmNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<JbpmNode> nodes) {
		this.nodes = nodes;
	}
	
}
