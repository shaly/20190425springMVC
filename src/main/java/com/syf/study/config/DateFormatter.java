package com.syf.study.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;


public class DateFormatter implements Formatter<Date> {

	private String formatStr="yyyy-MM-dd";
	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat(formatStr);
		return sdf.parse(text);
	}
	@Override
	public String print(Date object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}


	public String getFormatStr() {
		return formatStr;
	}

	public void setFormatStr(String formatStr) {
		this.formatStr = formatStr;
	}

}
