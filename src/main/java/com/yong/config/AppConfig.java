package com.yong.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by lichking on 2017. 4. 19..
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.yong")
public class AppConfig {
}
