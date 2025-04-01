package com.msys.ich.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class UserController {
    @GetMapping("/user")
        public ResponseEntity<String> get() {

            return new ResponseEntity<String>("GET Response", HttpStatus.OK);
        }

        @PostMapping("/user")
        public ResponseEntity<String> post(@RequestBody User user) {
            String responseMessage = "POST Response - Email:" + user.getEmail() + ",Password:" + user.getPassword();
            return new ResponseEntity<String>(responseMessage, HttpStatus.OK);
        }

        @PutMapping("/user")
        public ResponseEntity<String> put(@RequestBody User user) {
            String responseMessage = "PUT Response - Email: " + user.getEmail() + ", Password: " + user.getPassword();
            return new ResponseEntity<String>(responseMessage, HttpStatus.OK);
        }
    }



