package org.foreveross.jbpm.jbpmDemo.web.action.servlet;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.foreveross.jbpm.wsclient.JBPMApplication;
import org.foreveross.jbpm.wsclient.JBPMApplicationImplService;

import com.dayatang.domain.InstanceFactory;

public class ProcessImageServlet extends HttpServlet {

	private static final long serialVersionUID = 8246510620131052146L;
	
	private static final String CONTENT_TYPE = "image/gif";

	private JBPMApplication jbpmApplication;
	
	private JBPMApplication getJBPMApplication() {
		if(jbpmApplication==null){
			jbpmApplication = JBPMApplicationImplService.getJBPMApplication();
		}
		return jbpmApplication;
	}
	

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType(CONTENT_TYPE);
			long instanceId= Long.parseLong(request.getParameter("processInstanceId"));
			byte[] bytes = getJBPMApplication().getPorcessImageStream(instanceId);
			response.setContentLength(bytes.length);
			ServletOutputStream op = response.getOutputStream();
			op.write(bytes);
			op.flush();
			op.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
