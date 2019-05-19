package com.syf.study.config;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class BasePathHandler implements ServletContextAware{

	private ServletContext application;
	
	public void init() {
		HttpServletRequest req=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		String path=req.getContextPath();
		String basePath=null;
		if(req.getServerPort()==80) {
			basePath=req.getScheme()+"://"+req.getServerName()+path;
		}else {
			basePath=req.getScheme()+"://"+req.getServerName()+":"+req.getServerPort()+path;
		}
		//将路径放到全局中
		application.setAttribute("basePath", basePath);
	}
	
	@Override
	public void setServletContext(ServletContext application) {
		this.application=application;
	}

}
