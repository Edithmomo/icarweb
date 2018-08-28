package com.ccunix.icar.base.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

	public static SimpleDateFormat dateFormat_yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");

	public static String getDateString(SimpleDateFormat format, Date date) {
		return format.format(date);
	}

}
