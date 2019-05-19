package com.syf.study.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.syf.study.entity.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("1-------------------preHandle 当前类是-------------"+request.getClass().getName());
		User u=(User)request.getSession().getAttribute("sessionUser");
		if(u==null) {
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("2-------------------preHandle 当前类是-------------"+request.getClass().getName());
		HandlerMethod method = (HandlerMethod)handler;
		System.out.println("当前执行的类是："+method.getBean());
		System.out.println("当前执行的方法是:"+method.getMethod().getName());
		MethodParameter[] parameters = method.getMethodParameters();
		if(parameters.length>0) {
			for (MethodParameter methodParameter : parameters) {
				System.out.println("参数=====>"+methodParameter.getParameterName()+"==="+methodParameter.getParameterIndex());
			}
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("3-------------------preHandle 当前类是-------------"+request.getClass().getName());
		
	}

}
