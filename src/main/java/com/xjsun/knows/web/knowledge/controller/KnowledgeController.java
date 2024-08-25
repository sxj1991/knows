package com.xjsun.knows.web.knowledge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class KnowledgeController {

    @GetMapping("/know")
    public String getListKnows(){
        return "knows";
    }
}
