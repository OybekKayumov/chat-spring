package org.example;

import org.example.model.User;
import org.example.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChatController {

    @Autowired
    private final UserRepository userRepository;

    public ChatController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/init")
//    public HashMap<String, Boolean> init() {
    public String init() {
//        HashMap<String, Boolean> response = new HashMap<>();
//
//        response.put("result", true);
//        return response;
        return "yes";

    }

    @PostMapping("/auth")
    public HashMap<String, Boolean> auth(@RequestParam String name) {

        HashMap<String, Boolean> response = new HashMap<>();

        String sessionId = RequestContextHolder.currentRequestAttributes().getSessionId();
        User user = new User();
        user.setName(name);
        user.setSessionId(sessionId);

        userRepository.save(user);

        response.put("result", true);
        return response;
    }

    @PostMapping("/message")
    public Map<String, Boolean> sendMessage(@RequestParam String message) {

        return Map.of("result", true);
    }

    @GetMapping("/message")
    public List<String> getMessagesList() {
        return null;
    }

    @GetMapping("/user")
    public HashMap<Integer, String> getUsersList() {
        return null;
    }
}
