package com.itheime.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class QuickController {
    @RequestMapping("/quick2")
    public String quick(){
       // Aricler aricler=new Aricler(1L,"daf");

 return  "xxx";

    }
}
