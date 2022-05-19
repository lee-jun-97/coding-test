package com.programmers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SSG_3 {

    public static void main(String[] args) {
        
    }

    public int solution(int[][] masks, String[] dates) throws ParseException {
        
        int answer = 0;

        String[] temp = {};

        dates = diffDate(temp, dates);

        return answer;
    }

    public static String[] diffDate(String[] temp, String[] dates) throws ParseException {

        for(String i : dates) {
            if(i.contains("~")) {
                temp = i.split("~");

                dates = addDate(temp);
            }
        }

        return dates;
    }

    public static String[] addDate(String[] temp) throws ParseException {

        Date format1 = new SimpleDateFormat("yyyy/MM/dd").parse(temp[0]);
        Date format2 = new SimpleDateFormat("yyyy/MM/dd").parse(temp[1]);

        long diffDays = (format1.getTime() - format2.getTime()) / (24*60*60) ;

        for(int i=1; i<=diffDays; i++) {
            temp[temp.length+i] = temp[0] + diffDays ;
            System.out.println(temp[temp.length+i]);
        }

        return temp;
    }
    
}
