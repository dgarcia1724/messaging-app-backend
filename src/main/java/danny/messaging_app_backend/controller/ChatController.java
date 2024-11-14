package danny.messaging_app_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import danny.messaging_app_backend.entity.Message;
import danny.messaging_app_backend.service.MessageService;

@Controller
public class ChatController {
    @Autowired
    private MessageService messageService;

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public Message send(Message message) {
        // Save the message to the database for persistence
        return messageService.saveMessage(message);
    }
}

