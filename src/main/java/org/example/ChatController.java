package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ChatController {

    @GetMapping("/init")
    public Boolean init() {

        //todo: check sessionId, if found -> true
//        return "Yes";
        return true;

    }

    @PostMapping("/message")
    public Boolean sendMessage(@RequestParam String message) {

        return true;
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
