package com.am.jlfu.fileuploader.web;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.context.support.HttpRequestHandlerServlet;



/**
 *  to uploader.
 * 
 * 
 */
@Component("toJavaLargeFileUploaderServlet")
@WebServlet(name = "toJavaLargeFileUploaderServlet", urlPatterns = { "/toJavaLargeFileUploaderServlet" })
public class ToUploadServlet extends HttpRequestHandlerServlet
		implements HttpRequestHandler {

	private static final Logger log = LoggerFactory.getLogger(ToUploadServlet.class);

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("-------log here-------");
		response.sendRedirect("view/uploader.html");
	}

}
