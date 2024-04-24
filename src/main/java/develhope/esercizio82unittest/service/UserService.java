package develhope.esercizio82unittest.service;

import develhope.esercizio82unittest.entities.PersonalUser;
import develhope.esercizio82unittest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public PersonalUser setUserActivationStatus(Long userId, boolean isActive) {
        Optional<PersonalUser> user = userRepository.findById(userId);
        if (!user.isPresent()) return null;
        user.get().setActive(isActive);
        return userRepository.save(user.get());
    }
}
