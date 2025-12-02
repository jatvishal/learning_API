package com.api_learing.api_learing.authentication;

import com.api_learing.api_learing.utils.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/auth")
public class AuthController {
    Logger logger = Logger.getLogger(AuthController.class.getName());

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> user) {
        String username = user.get("username");
        // Example: assign default role USER
        List<String> roles = List.of("ADMIN");

        String token = jwtUtil.generateToken(username, roles);
        logger.info("Generated Token: " + token);
        return ResponseEntity.ok(token);
    }
}
