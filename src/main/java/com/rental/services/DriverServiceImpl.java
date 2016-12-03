package com.rental.services;

import com.rental.models.Driver;
import com.rental.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aluckyanto on 12/3/2016.
 */
@Service
public class DriverServiceImpl implements DriverService {

    @Autowired
    private DriverRepository driverRepository;

    @Override
    public void save(Driver driver) {
        driverRepository.save(driver);
    }

    @Override
    public List<Driver> findByStatus(Integer statusId) {
        return driverRepository.findByStatusId(statusId);
    }

    @Override
    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    @Override
    public Driver findById(Integer id) {
        return driverRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        driverRepository.delete(id);
    }
}
