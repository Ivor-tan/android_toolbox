package com.ivor.android_tools.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期格式化工具类
 */
public class DateTimeUtil {

    public static String fmt_ymd = "yyyy-MM-dd";
    public static String fmt_ymdhms = "yyyy-MM-dd HH:mm:ss";

    /**
     * 格式 yyyy年MM月dd日 HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String getDateTimeDisplayString(Date dateTime) {
        DateFormat dtf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String strDate2 = dtf2.format(dateTime);

        return strDate2;
    }

    /**
     * 格式 yyyy年MM月dd日
     *
     * @param dateTime
     * @return
     */
    public static String getDateTime(Date dateTime) {
        DateFormat dtf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String strDate2 = dtf2.format(dateTime);

        return strDate2;
    }

    /**
     * 格式:yyyyMMdd
     *
     * @param dateTime
     * @return
     */
    public static String getFormatDate(Date dateTime){
        DateFormat dft=new SimpleDateFormat("yyyyMMdd");
        String str=dft.format(dateTime);

        return str;
    }

    /**
     * 生成时间戳
     *
     * @return
     */
    public static Long calendarDate() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getTimeInMillis();
    }

    /**
     * 给指定日期添加 i 月
     *
     * @param currentTime
     * @param month
     * @return
     */
    public static Date addMonths(Date currentTime, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }

    public static Date add(Date currentTime, Integer day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.DATE, day);
        return calendar.getTime();
    }

    public static Date add(Date currentTime, Short day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.DATE, day);
        return calendar.getTime();
    }

    public static Boolean isAfter(Date resource, Date target) {
        return (resource.getTime() > target.getTime());
    }

    public static Boolean isBefore(Date resource, Date target) {
        return (resource.getTime() < target.getTime());
    }

    /**
     * 格式化后比较日期大小
     *
     * @param resource
     * @param target
     * @param type     日期格式
     * @return
     */
    public static Boolean isAfter(Date resource, Date target, String type) {
        try {
            DateFormat fmt = new SimpleDateFormat(type);
            resource = fmt.parse(fmt.format(resource));
            target = fmt.parse(fmt.format(target));
            return (resource.getTime() < target.getTime());
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * 格式化后比较日期大小
     *
     * @param resource
     * @param target
     * @param type     日期格式
     * @return
     */
    public static Boolean isAfterOrEqual(Date resource, Date target, String type) {
        try {
            DateFormat fmt = new SimpleDateFormat(type);
            resource = fmt.parse(fmt.format(resource));
            target = fmt.parse(fmt.format(target));
            return (resource.getTime() <= target.getTime());
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * 格式化后比较日期大小
     *
     * @param resource
     * @param target
     * @param type     日期格式
     * @return
     */
    public static Boolean isBefore(Date resource, Date target, String type) {
        try {
            DateFormat fmt = new SimpleDateFormat(type);
            resource = fmt.parse(fmt.format(resource));
            target = fmt.parse(fmt.format(target));
            return (resource.getTime() > target.getTime());
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * 格式:yyyy-MM-dd
     *
     * @param dateTime
     * @return
     */
    public static String getFmt_ymd(Date dateTime) {
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        String str = dft.format(dateTime);

        return str;
    }


    /**
     * 格式化后比较日期大小
     *
     * @param resource
     * @param target
     * @param type     日期格式
     * @return
     */
    public static Boolean isBeforeOrEqual(Date resource, Date target, String type) {
        try {
            DateFormat fmt = new SimpleDateFormat(type);
            resource = fmt.parse(fmt.format(resource));
            target = fmt.parse(fmt.format(target));
            return (resource.getTime() > target.getTime());
        } catch (ParseException e) {
            return false;
        }
    }
}
