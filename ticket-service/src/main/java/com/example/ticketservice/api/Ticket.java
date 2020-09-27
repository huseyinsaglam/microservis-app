package com.example.ticketservice.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class Ticket {

    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage()
    {
        return ResponseEntity.ok("Hello word ticket getMessage");
    }

    @GetMapping("/getMessage2")
    public ResponseEntity<String> getMessage2()
    {
        return ResponseEntity.ok("Hello word ticket getMessage2");
    }
}
