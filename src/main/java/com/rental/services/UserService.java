package com.rental.services;

import com.rental.models.User;

/**
 * Created by aluckyanto on 12/4/2016.
 */
public interface UserService {
    public void save(User user);

    public User findByUsername(String username);
}
