package com.ccunix.icar.employees.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeUtil {
	public  static long towDatesDelay(Date intime,Date outtime){
		long DateDelay  = outtime.getTime() - intime.getTime();
		System.out.println(DateDelay);
		if((DateDelay%(1000*60*60))==0){
			 return DateDelay/(1000*60*60);
		}else{
			 return DateDelay/(1000*60*60)+1;
		}
	}
	public static void main(String[] args) {
		String d1 = "2018-8-8 10:13:13";
		String d2 = "2018-8-8 13:43:13";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date intime=null;
		Date outtime=null;
		try {
			 intime = sf.parse(d1);
			 outtime = sf.parse(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(timeUtil.towDatesDelay(intime,outtime));
		
	}

}
