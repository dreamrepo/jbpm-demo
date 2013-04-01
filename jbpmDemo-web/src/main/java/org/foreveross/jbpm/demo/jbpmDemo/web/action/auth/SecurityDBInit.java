package org.foreveross.jbpm.demo.jbpmDemo.web.action.auth;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.foreveross.auth.application.ResourceApplication;
import org.foreveross.koala.auth.core.domain.Resource;
import org.foreveross.koala.auth.core.domain.ResourceLineAssignment;
import org.foreveross.koala.auth.core.domain.ResourceType;
import org.foreveross.koala.auth.core.domain.ResourceTypeAssignment;

import com.dayatang.domain.Entity;
import com.dayatang.domain.InstanceFactory;

public class SecurityDBInit extends HttpServlet {


	private ResourceApplication resourceApplication;
	
	public ResourceApplication getResourceApplication(){
		if(resourceApplication==null){
			resourceApplication = InstanceFactory.getInstance(ResourceApplication.class);
		}
		return resourceApplication;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -268354658112935661L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		getResourceApplication().initResource();
		resp.sendRedirect(req.getContextPath()+"/pages/common/dbInit.jsp");
	}
	
}
