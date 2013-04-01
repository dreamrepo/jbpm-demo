package org.foreveross.jbpm.jbpmDemo.applicationImpl;

import java.util.List;

import javax.inject.Named;
import javax.jws.WebService;

import org.foreveross.jbpm.jbpmDemo.application.WebServiceApplication;
import org.foreveross.jbpm.jbpmDemo.core.MessageLog;
import org.foreveross.jbpm.util.XmlParseUtil;
import org.springframework.transaction.annotation.Transactional;

@Named("webServiceApplication")
@Transactional
@WebService(targetNamespace="http://application.jbpmDemo.jbpm.foreveross.org/",endpointInterface="org.foreveross.jbpm.jbpmDemo.application.WebServiceApplication",serviceName="webServiceApplication")
public class WebServiceApplicationImpl implements WebServiceApplication {

	public String getTaskUser(String processParams,String userParams) {
		List<String> values = XmlParseUtil.parseList(userParams);
		String user = values.get(0);
		return "<Return><user>"+user+"</user></Return>";
	}

	public void logMessage(String user, String message) {
		System.out.println(user+":"+message);
		MessageLog log = new MessageLog();
		log.setUser(user);
		log.setText(message);
		log.save();
	}
	
	public static void main(String args[]){
		WebServiceApplication impl=new WebServiceApplicationImpl();
		String address="http://localhost:9000/ws";
	    javax.xml.ws.Endpoint.publish(address, impl);
	}

}
