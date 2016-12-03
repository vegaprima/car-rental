package com.rental.services;

import com.rental.models.Driver;

import java.util.List;

/**
 * Created by aluckyanto on 12/3/2016.
 */
public interface DriverService {
    public void save(Driver driver);
    public List<Driver> findByStatus(Integer statusId);
    public List<Driver> findAll();
    public Driver findById(Integer id);
    public void delete(Integer id);
}
