package org.foreveross.jbpm.jbpmDemo.application;
import javax.jws.*;

@WebService
public interface WebServiceApplication {

	public String getTaskUser(String processParams,String userParams);
	
}
