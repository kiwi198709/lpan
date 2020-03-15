package com.lzw.lpan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class Demo {
    @GetMapping("/list")
    public List<String> list() {
        ArrayList<String> list = new ArrayList<>();
        list.add("li");
        list.add("san");
        return list;
    }
}
