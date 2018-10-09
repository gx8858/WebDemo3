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
 * 使用BeanUtils来封装数据
 * @author Administrator
 *
 */
public class User2Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 4587417600858959675L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取数据
		Map<String, String []> map = request.getParameterMap();
		// 创建User对象
		User user = new User();
		
		// 完成注册（告诉封装数据的时候，遇到Date类型的时候，按着我给你传入对象的方式来解决）
		ConvertUtils.register(new MyConverter(), Date.class);
		
		// 可以使用工具类进行封装（导入包）
		try {
			BeanUtils.populate(user, map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 看结果
		System.out.println("用户名："+user.getUsername());
		System.out.println("密码："+user.getPassword());
		System.out.println("余额："+user.getMoney());
		System.out.println("生日："+user.getBirthday());
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}



