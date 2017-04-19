package com.yong.controller;

import com.yong.com.yong.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lichking on 2017. 4. 19..
 */
@RestController
public class JsonController {
    @GetMapping("")
    public Person test(){
        return new Person("LichKing", 29);
    }
}
