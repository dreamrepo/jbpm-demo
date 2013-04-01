package org.foreveross.jbpm.jbpmDemo.web.action.servlet;

import javax.servlet.ServletContextEvent;

import org.foreveross.jbpm.jbpmDemo.application.WebServiceApplication;
import org.foreveross.jbpm.jbpmDemo.applicationImpl.WebServiceApplicationImpl;
import org.springframework.web.context.ContextLoaderListener;

import com.dayatang.domain.InstanceFactory;

public class WSContextLoaderListener extends ContextLoaderListener {
	
	private WebServiceApplication webServiceApplication;
	
	public WebServiceApplication getWebServiceApplication(){
		if(webServiceApplication==null){
			webServiceApplication = InstanceFactory.getInstance(WebServiceApplication.class);
		}
		return webServiceApplication;
	}
	
	public void contextInitialized(ServletContextEvent event) {
		WebServiceApplication impl=new WebServiceApplicationImpl();
	    String address="http://localhost:9000/ws";
	    javax.xml.ws.Endpoint.publish(address,impl);
	}
}
