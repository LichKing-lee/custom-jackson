package com.yong.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.time.LocalDate;

/**
 * Created by lichking on 2017. 4. 19..
 */
public class CustomObjectMapper extends ObjectMapper {
    public CustomObjectMapper(){
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(LocalDate.class, new LocalDateSerializer());
        simpleModule.addDeserializer(LocalDate.class, new LocalDateDeserializer());

        registerModule(simpleModule);
    }
}
