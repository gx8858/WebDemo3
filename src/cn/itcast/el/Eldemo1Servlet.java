package cn.itcast.el;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Eldemo1Servlet extends HttpServlet {

	/**
	 * EL��������л�ȡ���Ե�ֵ
	 */
	private static final long serialVersionUID = 4854478113428314137L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��request���д���ֵ
		request.setAttribute("name", "С��");
		// ʹ��ת������ת����JSP��ҳ����
		request.getRequestDispatcher("/el/el1.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
