package com.syf.study.config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
import org.springframework.format.Formatter;

public class DateConverts  implements Converter<String,Date> {

	@Override
	public Date convert(String source) {

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			return null;
		}
	}

}
