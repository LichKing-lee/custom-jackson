package com.yong.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yong.json.LocalDateDeserializer;
import com.yong.json.LocalDateSerializer;
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
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate birthDay;
}
