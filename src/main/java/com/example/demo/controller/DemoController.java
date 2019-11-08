package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Autowired
  DemoService demoService;

  @GetMapping("/test")
  public String getServiceMessage(){
    return demoService.getMessage();
  }

}
