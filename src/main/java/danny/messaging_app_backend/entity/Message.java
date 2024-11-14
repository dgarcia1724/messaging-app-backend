package danny.messaging_app_backend.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String senderId; // Firebase UID of the sender
    private String receiverId; // Firebase UID of the receiver

    private LocalDateTime timestamp;

    // Optionally: boolean isRead;
}

