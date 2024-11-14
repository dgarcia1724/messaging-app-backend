package danny.messaging_app_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import danny.messaging_app_backend.entity.Message;
import danny.messaging_app_backend.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    @GetMapping("/{userId}")
    public List<Message> getMessages(@PathVariable String userId) {
        return messageService.getMessages(userId);
    }
}

