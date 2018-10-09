package cn.itcast.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.Converter;

/**
 * �������ת��
 */
public class MyConverter implements Converter{

//	@Override
//	public Object convert(Class paramClass, Object paramObject) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
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