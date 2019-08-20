package com.how2java.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.how2java.bean.Time;

public class TimeAction {
	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	public String showTime(){
		time = new Time();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String str = sdf.format(date);
		time.setNow(str);
		return "showTime";
	}
	
}
