package com.wangqiankun.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String,Date>{
    @Override
    public Date convert(String source) {
        DateFormat df = new SimpleDateFormat("yyyy--MM--dd");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            new RuntimeException("转换失败。");
            e.printStackTrace();
        }
        return null;
    }
}
