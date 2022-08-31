package com.elk.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elk.test.vo.UserVo;

@RestController
public class controller {
    
    @GetMapping("/api/userhi")
    public UserVo name() {
        return new UserVo("hi","hello", "12");
    }

    @GetMapping("/api/userok")
    public UserVo nameok() {
        return new UserVo("ok","14", "150");
    }
}
