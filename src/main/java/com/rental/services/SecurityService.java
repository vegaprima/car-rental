package com.rental.services;

/**
 * Created by aluckyanto on 12/4/2016.
 */
public interface SecurityService {
    public String findLoggedInUsername();
    public void autologin(String username, String password);
}
