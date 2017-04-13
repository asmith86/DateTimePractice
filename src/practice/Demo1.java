/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;

/**
 *
 * @author Alex
 */
public class Demo1 {

    public static void main(String[] args) {
      LocalDate date = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
      String textDate = date.format(formatter);
      date = LocalDate.parse(textDate, formatter);
      
        System.out.println(textDate);
        System.out.println(date);
              

    }

}
