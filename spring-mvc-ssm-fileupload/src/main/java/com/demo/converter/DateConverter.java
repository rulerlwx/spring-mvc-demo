package com.demo.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 只是一个原理演示，实际开发可以使用 @DateTimeFormat(pattern = "yyyy-MM-dd")
 *
 * Created by lwx on 2019/5/13.
 */
public class DateConverter implements Converter<String, Date> {
    public String datePattern;

    public DateConverter(String datePattern) {
        this.datePattern = datePattern;
        System.out.println("dataPattern:"+datePattern);
    }

    @Override
    public Date convert(String source) {
        try {
            System.out.println("source:"+source);
            SimpleDateFormat sf = new SimpleDateFormat(datePattern);
            sf.setLenient(false);
            return sf.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
