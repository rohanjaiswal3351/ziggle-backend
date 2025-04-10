package com.spring.ziggle.controller;

import com.spring.ziggle.dto.UserDto;
import com.spring.ziggle.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/getNextUsers")
    public ResponseEntity<Object> getNextUsers(@RequestParam String lastUserKey, @RequestParam int pageSize) {
        try {
            List<UserDto> data = userService.getNextUsers(lastUserKey, pageSize);
            return ResponseEntity.ok().body(data);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error reading data: " + e.getMessage());
        }
    }

    @PostMapping("/addUser")
    public ResponseEntity<Object> addUser(@RequestBody UserDto userDto) {
        try {
            userService.addUser(userDto);
            return ResponseEntity.ok().body("User added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error adding user: " + e.getMessage());
        }
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<Object> deleteUser(@RequestParam String uid) {
        try {
            userService.deleteUser(uid);
            return ResponseEntity.ok().body("User deleted successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error deleting user: " + e.getMessage());
        }
    }

    @GetMapping("/getUserById")
    public ResponseEntity<Object> getUserById(@RequestParam String uid) {
        try {
            UserDto data = userService.getUserById(uid);
            return ResponseEntity.ok().body(data);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error reading data: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserName")
    public ResponseEntity<Object> updateUserName(@RequestParam String uid, @RequestParam String name) {
        try {
            userService.updateUserName(uid, name);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserLikeNotify")
    public ResponseEntity<Object> updateUserLikeNotify(@RequestParam String uid) {
        try {
            userService.updateUserLikeNotify(uid);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserCity")
    public ResponseEntity<Object> updateUserCity(@RequestParam String uid, @RequestParam String city) {
        try {
            userService.updateUserCity(uid, city);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserGender")
    public ResponseEntity<Object> updateUserGender(@RequestParam String uid, @RequestParam String gender) {
        try {
            userService.updateUserGender(uid, gender);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserStar")
    public ResponseEntity<Object> updateUserStar(@RequestParam String uid, @RequestParam String star) {
        try {
            userService.updateUserStar(uid, star);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserImage")
    public ResponseEntity<Object> updateUserImage(@RequestParam String uid, @RequestParam String image) {
        try {
            userService.updateUserImage(uid, image);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserImage1")
    public ResponseEntity<Object> updateUserImage1(@RequestParam String uid, @RequestParam String image) {
        try {
            userService.updateUserImage1(uid, image);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/deleteUserImage1")
    public ResponseEntity<Object> deleteUserImage1(@RequestParam String uid) {
        try {
            userService.deleteUserImage1(uid);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserImage2")
    public ResponseEntity<Object> updateUserImage2(@RequestParam String uid, @RequestParam String image) {
        try {
            userService.updateUserImage2(uid, image);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/deleteUserImage2")
    public ResponseEntity<Object> deleteUserImage2(@RequestParam String uid) {
        try {
            userService.deleteUserImage2(uid);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserImage3")
    public ResponseEntity<Object> updateUserImage3(@RequestParam String uid, @RequestParam String image) {
        try {
            userService.updateUserImage3(uid, image);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/deleteUserImage3")
    public ResponseEntity<Object> deleteUserImage3(@RequestParam String uid) {
        try {
            userService.deleteUserImage3(uid);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserAge")
    public ResponseEntity<Object> updateUserAge(@RequestParam String uid, @RequestParam String age) {
        try {
            userService.updateUserAge(uid, age);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserBio")
    public ResponseEntity<Object> updateUserBio(@RequestParam String uid, @RequestParam String bio) {
        try {
            userService.updateUserBio(uid, bio);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserSwipeRightBy")
    public ResponseEntity<Object> updateUserSwipeRightBy(@RequestParam String uid,
                                                         @RequestParam String rightSwipeByUid,
                                                         @RequestParam int check) {
        try {
            userService.updateUserSwipeRightBy(uid, rightSwipeByUid, check);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserHeight")
    public ResponseEntity<Object> updateUserHeight(@RequestParam String uid, @RequestParam String height) {
        try {
            userService.updateUserHeight(uid, height);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserExercise")
    public ResponseEntity<Object> updateUserExercise(@RequestParam String uid, @RequestParam String exercise) {
        try {
            userService.updateUserExercise(uid, exercise);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserEducation")
    public ResponseEntity<Object> updateUserEducation(@RequestParam String uid, @RequestParam String education) {
        try {
            userService.updateUserEducation(uid, education);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserInstaId")
    public ResponseEntity<Object> updateUserInstaId(@RequestParam String uid, @RequestParam String instaId) {
        try {
            userService.updateUserInstaId(uid, instaId);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserSnapId")
    public ResponseEntity<Object> updateUserSnapId(@RequestParam String uid, @RequestParam String snapId) {
        try {
            userService.updateUserSnapId(uid, snapId);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserSwipeRightByAndMatches")
    public ResponseEntity<Object> updateUserSwipeRightByAndMatches(@RequestParam String uid, @RequestParam String rightSwipeByUid) {
        try {
            userService.updateUserSwipeRightByAndMatches(uid, rightSwipeByUid);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserFcmToken")
    public ResponseEntity<Object> updateUserFcmToken(@RequestParam String uid, @RequestParam String fcmToken) {
        try {
            userService.updateUserFcmToken(uid, fcmToken);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserMatches")
    public ResponseEntity<Object> updateUserMatches(@RequestParam String uid,
                                                    @RequestParam String matchUserUid,
                                                    @RequestParam int check) {
        try {
            userService.updateUserMatches(uid, matchUserUid, check);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserInterests")
    public ResponseEntity<Object> updateUserInterests(@RequestParam String uid,
                                                    @RequestParam String interest,
                                                    @RequestParam int check) {
        try {
            userService.updateUserInterests(uid, interest, check);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserBlocked")
    public ResponseEntity<Object> updateUserBlocked(@RequestParam String uid,
                                                      @RequestParam String blockedUserUid) {
        try {
            userService.updateUserBlocked(uid, blockedUserUid);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @PutMapping("/updateUserInteract")
    public ResponseEntity<Object> updateUserInteract(@RequestParam String uid,
                                                      @RequestParam String interactUserUid,
                                                      @RequestParam int check) {
        try {
            userService.updateUserInteract(uid, interactUserUid, check);
            return ResponseEntity.ok().body("User name updated successfully");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error updating user name: " + e.getMessage());
        }
    }

    @GetMapping("/checkIfUserExists")
    public ResponseEntity<Object> checkIfUserExists(@RequestParam String uid) {
        try {
            boolean exists = userService.checkIfUserExists(uid);
            return ResponseEntity.ok().body(exists);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error checking user existence: " + e.getMessage());
        }
    }

}

