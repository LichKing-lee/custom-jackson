package com.yong.controller;

import com.yong.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Created by lichking on 2017. 4. 19..
 */
@RestController
public class JsonController {
    @GetMapping("")
    public Person test(){
        return new Person("LichKing", 29, LocalDate.of(1990, 2, 2));
    }
}
