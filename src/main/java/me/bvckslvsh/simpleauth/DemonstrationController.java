package me.bvckslvsh.simpleauth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demonstration-controller")
public class DemonstrationController {

    @GetMapping
    public ResponseEntity<String> sayHi() {
        return ResponseEntity.ok("Hi! You're in secured endpoint.");
    }
}
