package org.foreveross.jbpm.jbpmDemo.applicationImpl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Named;
import javax.xml.namespace.QName;
import org.foreveross.jbpm.jbpmDemo.application.FormApplication;
import org.foreveross.jbpm.jbpmDemo.application.vo.FormTaskVo;
import org.foreveross.jbpm.jbpmDemo.application.vo.FormVO;
import org.foreveross.jbpm.jbpmDemo.application.vo.MessageLogVO;
import org.foreveross.jbpm.jbpmDemo.core.FormEntity;
import org.foreveross.jbpm.jbpmDemo.core.MessageLog;
import org.foreveross.jbpm.util.XmlParseUtil;
import org.foreveross.jbpm.wsclient.JBPMApplication;
import org.foreveross.jbpm.wsclient.JBPMApplicationImplService;
import org.foreveross.jbpm.wsclient.ProcessInstanceVO;
import org.foreveross.jbpm.wsclient.TaskVO;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;

import com.dayatang.domain.InstanceFactory;
import com.dayatang.querychannel.service.QueryChannelService;

@Transactional
@Named("formApplication")
public class FormApplicationImpl implements FormApplication {

	private static QueryChannelService queryChannel;

	public static QueryChannelService getQueryChannel() {
		if (queryChannel == null) {
			queryChannel = InstanceFactory
					.getInstance(QueryChannelService.class);
		}
		return queryChannel;
	}
	
	private JBPMApplication jbpmApplication;
	
	private JBPMApplication getJBPMApplication() {
		if(jbpmApplication==null){
			jbpmApplication = JBPMApplicationImplService.getJBPMApplication();
		}
		return jbpmApplication;
	}

	
	public List<FormVO> queryAll() {
		List<FormVO> formList = new ArrayList<FormVO>();
		List<FormEntity> forms = getQueryChannel().queryResult("select form from FormEntity form", new Object[]{});
		for(FormEntity form:forms){
			FormVO formVo = new FormVO();
			BeanUtils.copyProperties(form, formVo);
			formList.add(formVo);
		}
		return formList;
	}

	public void updateFormVO(FormVO formVO) {
		FormEntity entity = new FormEntity();
		BeanUtils.copyProperties(formVO, entity);
		entity.save();
	}

	public FormVO getFormVO(long id) {
		FormEntity entity = FormEntity.get(FormEntity.class, id);
		FormVO formVo = new FormVO();
		BeanUtils.copyProperties(entity, formVo);
		return formVo;
	}
	
	public List<FormTaskVo> getFormTaskVo(String user){
		List<FormTaskVo> forms  = new ArrayList<FormTaskVo>();
		List<TaskVO> tasks  = getJBPMApplication().queryTodoList(user);
		for(TaskVO task:tasks){
			FormTaskVo vo = new FormTaskVo();
			String data = task.getProcessData();
			Map<String,Object> params = XmlParseUtil.xmlToPrams(data);
			String formId = (String)params.get("formId");
			if(formId==null)continue;
			FormVO form = this.getFormVO((new Long(formId)));
			vo.setActualName(task.getActualName());
			vo.setActualOwner(task.getActualOwner());
			vo.setApplyDate(task.getCreateDate());
			vo.setCreater(task.getCreater());
			vo.setProcessName(task.getProcessName());
			vo.setTaskId(task.getTaskId());
			vo.setName(form.getName());
			vo.setRemark(form.getRemark());
			vo.setFormId(formId);
			vo.setProcessId(task.getProcessInstanceId());
			forms.add(vo);
		}
		return forms;
	}
	
	public List<FormTaskVo> getErrorList(){
		List<FormTaskVo> forms  = new ArrayList<FormTaskVo>();
		List<TaskVO> tasks  = getJBPMApplication().queryErrorList();
		for(TaskVO task:tasks){
			FormTaskVo vo = new FormTaskVo();
			String data = task.getProcessData();
			Map<String,Object> params = XmlParseUtil.xmlToPrams(data);
			String formId = (String)params.get("formId");
			if(formId==null)continue;
			FormVO form = this.getFormVO((new Long(formId)));
			vo.setActualName(task.getActualName());
			vo.setActualOwner(task.getActualOwner());
			vo.setApplyDate(task.getCreateDate());
			vo.setCreater(task.getCreater());
			vo.setProcessName(task.getProcessName());
			vo.setTaskId(task.getTaskId());
			vo.setName(form.getName());
			vo.setRemark(form.getRemark());
			vo.setFormId(formId);
			vo.setProcessId(task.getProcessInstanceId());
			forms.add(vo);
		}
		return forms;
	}

	public List<FormTaskVo> getFormDoneTaskVo(String user){
		List<FormTaskVo> forms  = new ArrayList<FormTaskVo>();
		List<TaskVO> tasks  = getJBPMApplication().queryDoenTask(user);
		for(TaskVO task:tasks){
			FormTaskVo vo = new FormTaskVo();
			String data = task.getProcessData();
			Map<String,Object> params = XmlParseUtil.xmlToPrams(data);
			String formId = (String)params.get("formId");
			if(formId==null)continue;
			FormVO form = this.getFormVO((new Long(formId)));
			vo.setActualName(task.getActualName());
			vo.setActualOwner(task.getActualOwner());
			vo.setApplyDate(task.getCreateDate());
			vo.setCreater(task.getCreater());
			vo.setProcessName(task.getProcessName());
			vo.setTaskId(task.getTaskId());
			vo.setName(form.getName());
			vo.setRemark(form.getRemark());
			vo.setFormId(formId);
			vo.setProcessId(task.getProcessInstanceId());
			forms.add(vo);
		}
		return forms;
	}

	public List<FormTaskVo> queryActiveFormVo(){
		List<ProcessInstanceVO> processes = getJBPMApplication().queryAllActiveProcess("defaultPackage.Trade");
		List<FormTaskVo> forms  = new ArrayList<FormTaskVo>();
		for(ProcessInstanceVO process:processes){
			Map<String,Object> params = XmlParseUtil.xmlToPrams(process.getData());
			String formId = (String)params.get("formId");
			FormVO form = this.getFormVO((new Long(formId)));
			FormTaskVo vo = new FormTaskVo();
			vo.setApplyDate(process.getCreateDate());
			vo.setCreater(process.getCreater());
			vo.setProcessName(process.getProcessName());
			vo.setName(form.getName());
			vo.setRemark(form.getRemark());
			vo.setFormId(formId);
			vo.setProcessId(process.getProcessInstanceId());
			forms.add(vo);
		}
		return forms;
	}
	
	public List<MessageLogVO> getMessages(String user) {
		List<MessageLog> lists = getQueryChannel().queryResult("select log from MessageLog log where log.user = ?", new Object[]{user});
		List<MessageLogVO> messages = new ArrayList<MessageLogVO>();
		for(MessageLog log:lists){
			MessageLogVO vo = new MessageLogVO();
			BeanUtils.copyProperties(log, vo);
			messages.add(vo);
		}
		return messages;
	}
}
