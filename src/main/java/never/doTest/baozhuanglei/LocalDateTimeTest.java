package never.doTest.baozhuanglei;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Description: TODO
 * @author: Bo Li
 * @date: 2022年06月02日 17:00
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(localDateTime);

        LocalDateTime of = LocalDateTime.of(1990, 11, 11, 11, 11, 11);
        LocalTime of1 = LocalTime.of(18, 29, 12);
        LocalDate of2 = LocalDate.of(1991, 12, 25);
        System.out.println(of);
        System.out.println(of1);
        System.out.println(of2);

        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfWeek().getValue());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getNano());
        System.out.println(localDateTime.getSecond());


        LocalDateTime localDateTime1 = localDateTime.withMonth(7);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.plusMonths(10);
        System.out.println(localDateTime2);
        System.out.println(localDateTime);

        LocalDateTime localDateTime3 = localDateTime.minusMonths(9);
        System.out.println(localDateTime3);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String format = dateTimeFormatter.format(localDateTime);
        System.out.println(format);


        TemporalAccessor parse = dateTimeFormatter.parse("2022-12-21 12:23:22");
        System.out.println(parse);



    }















}
