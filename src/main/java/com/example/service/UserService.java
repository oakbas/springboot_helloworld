package com.example.service;

import java.util.Iterator;
import com.example.domain.User;

/**
 * Created by ozlemakbas on 18/03/16.
 */

public interface UserService {

    Iterable<User> listAllUsers();

    User getUserById(Integer id);

    User saveUser(User user);
}
