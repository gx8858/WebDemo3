package cn.itcast.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

import cn.itcast.domain.MyConverter;
import cn.itcast.domain.User;

/**
 * ʹ��BeanUtils����װ����
 * @author Administrator
 *
 */
public class User2Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 4587417600858959675L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ����
		Map<String, String []> map = request.getParameterMap();
		// ����User����
		User user = new User();
		
		// ���ע�ᣨ���߷�װ���ݵ�ʱ������Date���͵�ʱ�򣬰����Ҹ��㴫�����ķ�ʽ�������
		ConvertUtils.register(new MyConverter(), Date.class);
		
		// ����ʹ�ù�������з�װ���������
		try {
			BeanUtils.populate(user, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// �����
		System.out.println("�û�����"+user.getUsername());
		System.out.println("���룺"+user.getPassword());
		System.out.println("��"+user.getMoney());
		System.out.println("���գ�"+user.getBirthday());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}



