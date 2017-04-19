package com.yong.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * Created by lichking on 2017. 4. 19..
 */
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private LocalDate birthDay;
}
