package org.foreveross.jbpm.jbpmDemo.application;

import java.util.List;

import org.foreveross.jbpm.jbpmDemo.application.vo.FormTaskVo;
import org.foreveross.jbpm.jbpmDemo.application.vo.FormVO;
import org.foreveross.jbpm.jbpmDemo.application.vo.MessageLogVO;


public interface FormApplication {
	
	public List<FormVO> queryAll();
	
	public void updateFormVO(FormVO formVO);
	
	public FormVO getFormVO(long id);
	
	public List<FormTaskVo> getFormTaskVo(String user);
	
	public List<FormTaskVo> getFormDoneTaskVo(String user);
	
	public List<FormTaskVo> queryActiveFormVo();
	
	public List<MessageLogVO> getMessages(String user);
	
	public List<FormTaskVo> getErrorList();
}
