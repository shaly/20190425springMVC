package com.syf.study.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.Formatter;

public class DateConverts  implements Converter<String,Date> {
	
	private String formatStr="yyyy-MM-dd";

	@Override
	public Date convert(String source) {

		SimpleDateFormat sdf=new SimpleDateFormat(formatStr);
		
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			return null;
		}
	}

	public String getFormatStr() {
		return formatStr;
	}

	public void setFormatStr(String formatStr) {
		this.formatStr = formatStr;
	}
	
	

}
