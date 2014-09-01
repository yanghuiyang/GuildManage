package com.groupfive.gm.model;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.dispatcher.ServletRedirectResult;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

public class StringResult extends ServletRedirectResult {

	private static final long serialVersionUID = 413113691791547751L;
	
	private transient static final Logger log = LoggerFactory.getLogger(StringResult.class);
	
	private String contentType;
	
	private Object root;
	
	private boolean excludeNullProperties;
	
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Object getRoot() {
		return root;
	}

	public void setRoot(Object root) {
		this.root = root;
	}

	public boolean isExcludeNullProperties() {
		return excludeNullProperties;
	}

	public void setExcludeNullProperties(boolean excludeNullProperties) {
		this.excludeNullProperties = excludeNullProperties;
	}

	public StringResult() {
		super();
	}

	public StringResult(String location) {
		super(location);
	}

	@Override
	protected void doExecute(String finalLocation, ActionInvocation invocation)
			throws Exception {
		HttpServletResponse response = (HttpServletResponse) invocation.getInvocationContext().get(HTTP_RESPONSE);   
		HttpServletRequest request = (HttpServletRequest) invocation.getInvocationContext().get(HTTP_REQUEST);
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(request.getAttribute(finalLocation).toString());
		} catch (NullPointerException e) {
			if (finalLocation.equals("")) {
				log.warn("Œ¥÷∏∂®value", e);
			} else {
				log.error("ø’÷µ", e);
			}
		} finally {
			if (writer != null) {
				writer.flush();
				writer.close();
			}
		}   
	}
}
