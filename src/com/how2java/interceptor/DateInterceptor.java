package com.how2java.interceptor;

import java.util.Date;

import com.how2java.action.CategoryAction;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class DateInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		CategoryAction action = (CategoryAction) invocation.getAction();
		action.setDate(new Date());
		return invocation.invoke();
	}

}
