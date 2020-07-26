package com.picc.lpl.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {


    public static void main(String[] args) {
        //获取当前日期LocalDate
        LocalDate localDate=LocalDate.now();
        System.out.println("当前日期="+localDate);

        //获取年月日信息
        System.out.println();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println("year="+year);
        System.out.println("month="+month);
        System.out.println("day="+day);

        //创建指定日期LocalDate.of
        System.out.println();
        LocalDate localDate1 = LocalDate.of(2020, 7, 25);
        System.out.println(localDate1);

        //判断两个日期是否相等equals
        System.out.println();
        System.out.println(localDate.equals(localDate1));

        //计算一周后的日期plus
        System.out.println();
        LocalDate localDate2 = localDate.plusDays(1);
        System.out.println("一天后的日期为："+localDate2);
        LocalDate localDate3 = localDate.plusWeeks(1);
        System.out.println("一周后的日期为："+localDate3);
        LocalDate localDate4 = localDate.plus(1, ChronoUnit.DAYS);
        System.out.println("一天后的日期为："+localDate4);
        LocalDate localDate5 = localDate.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后的日期为："+localDate5);

        //计算一周前的日期minus
        System.out.println();
        LocalDate localDate6 = localDate.minusDays(1);
        System.out.println("一天前的日期为："+localDate6);
        LocalDate localDate7 = localDate.minusWeeks(1);
        System.out.println("一周前的日期为："+localDate7);
        LocalDate localDate8 = localDate.minus(1, ChronoUnit.DAYS);
        System.out.println("一天前的日期为："+localDate8);
        LocalDate localDate9 = localDate.minus(1, ChronoUnit.WEEKS);
        System.out.println("一周前的日期为："+localDate9);

        //clock
        System.out.println();
        Clock clock=Clock.systemUTC();
        System.out.println(clock.millis());
        System.out.println(System.currentTimeMillis());

        //判断日期大小isAfter isBefore
        System.out.println();
        LocalDate localDate10 = LocalDate.of(2020, 7, 20);
        System.out.println(localDate.isAfter(localDate10));
        System.out.println(localDate.isBefore(localDate10));

        //计算两个日期相差天数Period
        System.out.println();
        Period period = Period.between(localDate10, localDate);
        System.out.println(period.getDays());
        LocalDate localDate11 = LocalDate.of(2020, 5, 20);
        Period period2 = Period.between(localDate11, localDate);
        System.out.println(period2.getMonths());
        System.out.println(period2.getDays());

        //Instant
        System.out.println();
        Instant instant=Instant.now();
        System.out.println(instant.toEpochMilli());
        System.out.println(System.currentTimeMillis());

        //日期格式化DateTimeFormatter
        System.out.println();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String string = localDate.format(dateTimeFormatter);
        System.out.println(string);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.BASIC_ISO_DATE;
        String string2 = localDate.format(dateTimeFormatter1);
        System.out.println(string2);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_DATE;
        String string3 = localDate.format(dateTimeFormatter2);
        System.out.println(string3);

        //localDateTime
        System.out.println();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter3=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String string4 = localDateTime.format(dateTimeFormatter3);
        System.out.println(string4);
        LocalDateTime localDateTime2=LocalDateTime.of(2020,7,25,23,0,0);
        Duration duration=Duration.between(localDateTime,localDateTime2);
        System.out.println(duration.toMinutes());
    }

}
