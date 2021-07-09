package com.github.xxvenonxx.carAtlas.service.imp;

import com.github.xxvenonxx.carAtlas.domain.model.User;
import com.github.xxvenonxx.carAtlas.domain.repository.UserRepository;
import com.github.xxvenonxx.carAtlas.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class JpaUserService implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public JpaUserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.getById(userId);
    }

    @Override
    public void addUser(User userToAdd) {
        String encodedPassword = passwordEncoder.encode(userToAdd.getPassword());
        userToAdd.setPassword(encodedPassword);
        userToAdd.setRole("ROLE_USER");
        userRepository.save(userToAdd);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
