package danny.messaging_app_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import danny.messaging_app_backend.entity.Message;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySenderIdOrReceiverIdOrderByTimestamp(String senderId, String receiverId);
}
