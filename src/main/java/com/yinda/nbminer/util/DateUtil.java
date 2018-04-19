package com.yinda.nbminer.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
/**
 * @author auto
 * 2017年10月27日
 */
public class DateUtil {
	public static String YYYY_MM_DD="yyyy-MM-dd";
	public static String YYYY_MM_DD_SS="yyyy-MM-dd HH:mm:ss";
	/**获取日期**/
	public static String getCurDateStr(String str){
		SimpleDateFormat sf=new SimpleDateFormat(str);
		return sf.format(new Date());
	}
	/**拼接当前日期最小日期*/
	public static String setMinHHmmss(String dateStr){
		if(dateStr==null||StringUtils.isEmpty(dateStr)||dateStr.length()>10){
			return dateStr;
		}
		return dateStr.trim()+" 00:00:00";
	}
	/**拼接当前日期最大日期*/
	public static String setMaxHHmmss(String dateStr){
		if(dateStr==null||StringUtils.isEmpty(dateStr)||dateStr.length()>10){
			return dateStr;
		}
		return dateStr.trim()+" 23:59:59";
	}
	/**datetostr*/
	public static String dateToStr(Date date,String type){
		SimpleDateFormat format=new SimpleDateFormat(type);
		return format.format(date);
	}
	/**strToDate
	 * @throws ParseException
	 */
	public static Date strToDate(String dateStr,String type) throws ParseException{
		SimpleDateFormat format=new SimpleDateFormat(type);
		return format.parse(dateStr);
	}
	/**日期相差多少天*/
	public static long getDayDifDate(Date date,Date date1){
		long difVal=Math.abs(date.getTime()-date1.getTime())/1000/60/60/24;
		return difVal;
	}
	/**日期相差多少天*/
	public static long getDayDifDate(String str,String str1,String type) throws ParseException{
		return getDayDifDate(strToDate(str,type),strToDate(str1,type));
	}
	public static Timestamp getCurSqlDate() {
		return new Timestamp(System.currentTimeMillis());
	}
}
