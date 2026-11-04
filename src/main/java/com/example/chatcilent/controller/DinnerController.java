package com.example.chatcilent.controller;

import com.example.chatcilent.dto.DinnerRequest;
import com.example.chatcilent.service.DinnerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinnerController {
    private final DinnerService service;

    public DinnerController(DinnerService service){
        this.service = service;
    }

    @PostMapping("/api/dinner/demo")
    public String demo(){
        return service.demo();
    }

    @PostMapping("/api/dinner")
    public String suggest(@RequestBody DinnerRequest request){
        return service.suggest(request);
    }
}