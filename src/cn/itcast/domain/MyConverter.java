package cn.itcast.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

/**
 * 完成日期转换
 */
public class MyConverter implements Converter{

//	@Override
//	public Object convert(Class paramClass, Object paramObject) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	/**
	 * obj：用户输入的数据
	 */
	public Object convert(Class clazz, Object obj) {
		// 把obj转换日期类型
		String str = (String) obj;
		// 把字符串转换日期
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			// 转换
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("转换日期错误");
		}
		return date;
	}

}