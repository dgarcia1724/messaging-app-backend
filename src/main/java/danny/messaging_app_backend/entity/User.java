package danny.messaging_app_backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String firebaseUid; // Firebase UID as the primary key

    private String username;
    private String email;

    // Additional fields if needed (e.g., profile picture URL, status, etc.)
}
