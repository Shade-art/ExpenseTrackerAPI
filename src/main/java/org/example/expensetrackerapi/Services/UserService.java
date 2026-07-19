package org.example.expensetrackerapi.Services;

import org.example.expensetrackerapi.DTO.CreateUserRequestDTO;
import org.example.expensetrackerapi.DTO.UsersNamesDTO;
import org.example.expensetrackerapi.entity.User;
import org.example.expensetrackerapi.exception.EmailAlreadyExistsException;
import org.example.expensetrackerapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    UserService(UserRepository repository)
    {
        this.repository = repository;
    }

    public void saveUser(CreateUserRequestDTO reqUser)
    {
        if (repository.existsByEmail(reqUser.getEmail())) {
            throw new EmailAlreadyExistsException("Email already exists");
        }

        // Only reached if exception was NOT thrown
        User user = new User();
        user.setName(reqUser.getName());
        user.setEmail(reqUser.getEmail());
        repository.save(user);
    }

    //get all users

    public List<UsersNamesDTO> getAllUser()
    {
        return repository.findAll()
                .stream()
                .map(user -> new UsersNamesDTO(
                        user.getName(),
                        user.getEmail()
                ))
                .toList();
    }

}
