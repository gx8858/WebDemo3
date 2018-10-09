package cn.itcast.servlet;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;

import cn.itcast.domain.User;

/**
 * ������ݵķ�װ
 * @author Administrator
 *
 */
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 6390620317553505800L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ��ȡ�������
		// ��������
		// set������������
		/**
		 * 	String username = request.getParameter("username");
			String password = request.getParameter("password");
			// ��ɷ�װ
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			// �ں�̨�ĳ����д���user����
		 */
		// ʹ����ʡ�����ݷ�װ	// Map:String ��username����password��  String[]���û����룩
		Map<String, String[]> map = request.getParameterMap();
		// ����User����
		User user = new User();
		// ��װ����
		try {
			populate(user,map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ���û�����⣬��ȡuser�����е�����
		System.out.println("������"+user.getUsername());
		System.out.println("���룺"+user.getPassword());
	}
	
	/**
	 * ���ݷ�װ
	 * @param user
	 * @param map
	 * @throws Exception 
	 */
	public void populate(User user, Map<String, String[]> map) throws Exception {
		// ���ݷ�װ
		BeanInfo info = Introspector.getBeanInfo(user.getClass());
		// ��ȡ���Ե�������Ϣ
		PropertyDescriptor [] pds = info.getPropertyDescriptors();
		// ѭ������
		for (PropertyDescriptor pd : pds) {
			// ���е�name���Ե�ֵ��JavaBean���������Ҫ����ͬ����װ��
			// ��ȡ���Ե�����
			String proName = pd.getName();
			// map�е�key�Ƿ�����Ե�������ͬ�������ͬ����װ���ݡ�
			if(map.containsKey(proName)){
				// ��ȡ���Ե�д����
				Method m = pd.getWriteMethod();
				// ִ�и÷���
				m.invoke(user, map.get(proName)[0]);
			}
		}
	}
	


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	@Test
	public void run() throws Exception{
		// ��ȡclass���������ַ���
		User user = new User();
		// ������ʡ	���Ѿ���ȡ����User JavaBean����Ϣ
		BeanInfo info = Introspector.getBeanInfo(user.getClass());
		// ��ȡ���Ե�������Ϣ
		PropertyDescriptor [] pds = info.getPropertyDescriptors();
		// ѭ������
		for (PropertyDescriptor pd : pds) {
			// �ܻ�ȡ���Ե������أ�
			// System.out.println(pd.getName());
			if(!"class".equals(pd.getName())){
				// ��ȡ���Ե�д����	
				Method m = pd.getWriteMethod();
				// setUsername  setPassword ���� ִ��
				m.invoke(user, "admin");	// user.setUsername("admin")	user.setPassword("admin")
			}
		}
		
		// ��������Ѿ���װ�ɹ���  ˵��User�����Ѿ���������
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

}














