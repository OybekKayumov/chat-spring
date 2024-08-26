package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ChatController {

    @GetMapping("/init")
    public HashMap<String, Boolean> init() {

//        return "Yes";
        //todo: check sessionId, if found -> true
        HashMap<String, Boolean> response = new HashMap<>();

        response.put("result", true);
        return response;

    }

    @PostMapping("/auth")
    public HashMap<String, Boolean> auth(@RequestParam String name) {

        //todo: create user with name, sessionId
        // save User to DB

        HashMap<String, Boolean> response = new HashMap<>();
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
