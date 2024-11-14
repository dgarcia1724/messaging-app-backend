package danny.messaging_app_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import danny.messaging_app_backend.entity.Message;
import danny.messaging_app_backend.repository.MessageRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        message.setTimestamp(LocalDateTime.now());
        return messageRepository.save(message);
    }

    public List<Message> getMessages(String userId) {
        return messageRepository.findBySenderIdOrReceiverIdOrderByTimestamp(userId, userId);
    }
}

