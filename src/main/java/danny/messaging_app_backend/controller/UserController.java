package danny.messaging_app_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import danny.messaging_app_backend.entity.User;
import danny.messaging_app_backend.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{firebaseUid}")
    public User getUser(@PathVariable String firebaseUid) {
        return userService.getUserByFirebaseUid(firebaseUid);
    }
}
