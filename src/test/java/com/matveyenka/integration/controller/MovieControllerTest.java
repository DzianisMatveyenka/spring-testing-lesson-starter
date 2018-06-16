package com.matveyenka.integration.controller;

import com.matveyenka.config.WebConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = WebConfig.class)
@WebAppConfiguration
public class MovieControllerTest {

}
