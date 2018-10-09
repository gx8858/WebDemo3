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
 * 完成数据的封装
 * @author Administrator
 *
 */
public class UserServlet extends HttpServlet {
	
	private static final long serialVersionUID = 6390620317553505800L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取请求参数
		// 创建对象
		// set方法设置数据
		/**
		 * 	String username = request.getParameter("username");
			String password = request.getParameter("password");
			// 完成封装
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			// 在后台的程序中传输user对象
		 */
		// 使用内省来数据封装	// Map:String （username或者password）  String[]（用户输入）
		Map<String, String[]> map = request.getParameterMap();
		// 创建User对象
		User user = new User();
		// 封装数据
		try {
			populate(user,map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 如果没有问题，获取user对象中的数据
		System.out.println("姓名："+user.getUsername());
		System.out.println("密码："+user.getPassword());
	}
	
	/**
	 * 数据封装
	 * @param user
	 * @param map
	 * @throws Exception 
	 */
	public void populate(User user, Map<String, String[]> map) throws Exception {
		// 数据封装
		BeanInfo info = Introspector.getBeanInfo(user.getClass());
		// 获取属性的描述信息
		PropertyDescriptor [] pds = info.getPropertyDescriptors();
		// 循环遍历
		for (PropertyDescriptor pd : pds) {
			// 表单中的name属性的值和JavaBean中属性如果要是相同，封装。
			// 获取属性的名称
			String proName = pd.getName();
			// map中的key是否和属性的名称相同，如果相同，封装数据。
			if(map.containsKey(proName)){
				// 获取属性的写方法
				Method m = pd.getWriteMethod();
				// 执行该方法
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
		// 获取class对象有三种方法
		User user = new User();
		// 测试内省	我已经获取到了User JavaBean的信息
		BeanInfo info = Introspector.getBeanInfo(user.getClass());
		// 获取属性的描述信息
		PropertyDescriptor [] pds = info.getPropertyDescriptors();
		// 循环遍历
		for (PropertyDescriptor pd : pds) {
			// 能获取属性的名称呢？
			// System.out.println(pd.getName());
			if(!"class".equals(pd.getName())){
				// 获取属性的写方法	
				Method m = pd.getWriteMethod();
				// setUsername  setPassword 对象 执行
				m.invoke(user, "admin");	// user.setUsername("admin")	user.setPassword("admin")
			}
		}
		
		// 如果数据已经封装成功了  说明User里面已经有数据了
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
	}

}














