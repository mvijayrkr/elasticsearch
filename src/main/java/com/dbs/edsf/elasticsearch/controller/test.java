package com.dbs.edsf.elasticsearch.controller;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
//import org.joda.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import java.time.LocalDateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class test {
    public static void main(String[] args){
        String aMonthAgo = ISODateTimeFormat.yearMonthDay().print(new DateTime(DateTimeZone.UTC).minusMonths(1));
        String aMonthFromNow = ISODateTimeFormat.yearMonthDay().print(new DateTime(DateTimeZone.UTC).plusMonths(1));
        System.out.println(aMonthAgo);
        System.out.println(aMonthFromNow);

        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String formattedDate4 = dateTimeFormatter4.format(datetime);
        String formattedDate5 = dateTimeFormatter4.format(datetime.minusMinutes(15));
        System.out.println(formattedDate4);
        System.out.println(formattedDate5);

       /* //Using Date class
        Date date = new Date();
        //Pattern for showing milliseconds in the time "SSS"
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.SSSZZ");
        String stringDate = sdf.format(date);
        System.out.println(stringDate);

        //Using Calendar class
        Calendar cal = Calendar.getInstance();
        String stringDate2 = sdf.format(cal.getTime());
        System.out.println(stringDate2);*/
    }
}
