package com.matveyenka.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.matveyenka.dao", "com.matveyenka.service"})
public class RootConfig {

}
