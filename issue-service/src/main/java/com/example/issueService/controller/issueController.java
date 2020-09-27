package com.example.issueService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/issue")
public class issueController {

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage()
    {
        return ResponseEntity.ok("Hello word issue getMessage");
    }
}
