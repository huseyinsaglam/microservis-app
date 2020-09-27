package com.example.accountservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class Account {

    @GetMapping("{/id}")
    public ResponseEntity<String> getByid(@PathVariable ("id") String id)
    {
        return ResponseEntity.ok("Account service id = " + id);
    }

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage()
    {
        return ResponseEntity.ok("Hello word account getMessage");
    }

    @GetMapping("/getMessage2")
    public ResponseEntity<String> getMessage2()
    {
        return ResponseEntity.ok("Hello word account getMessage2");
    }
}
