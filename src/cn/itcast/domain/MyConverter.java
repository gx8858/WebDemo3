package cn.itcast.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

/**
 * �������ת��
 * @author Administrator
 *
 */
public class MyConverter implements Converter{
	
	/**
	 * obj���û����������
	 */
	public Object convert(Class clazz, Object obj) {
		// ��objת����������
		String str = (String) obj;
		// ���ַ���ת������
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			// ת��
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("ת�����ڴ���");
		}
		return date;
	}

}