package com.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.MessageService;

/**
 * 多选删除
 */
public class DeleteBatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * doGet方法
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * doPost方法
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String[] ids = request.getParameterValues("id");
		MessageService messageService = new MessageService();
		messageService.deleteBatch(ids);
		request.getRequestDispatcher("/ListServlet").forward(request, response);
	}

}
