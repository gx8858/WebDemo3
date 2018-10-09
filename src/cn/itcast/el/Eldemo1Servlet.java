package cn.itcast.el;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Eldemo1Servlet extends HttpServlet {

	/**
	 * EL从域对象中获取属性的值
	 */
	private static final long serialVersionUID = 4854478113428314137L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 向request域中存入值
		request.setAttribute("name", "小凤");
		// 使用转发，给转发到JSP的页面上
		request.getRequestDispatcher("/el/el1.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
