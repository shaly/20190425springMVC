package com.syf.study.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;


public class DateFormatter implements Formatter<Date> {

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(text);
	}
	@Override
	public String print(Date object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}


}
