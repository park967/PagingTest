package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

class BoardController {

    @GetMapping("/board")
        public String index(){
            return "index";
        }


}
