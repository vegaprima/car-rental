package com.rental.repositories;

import com.rental.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aluckyanto on 12/3/2016.
 */
@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {
    public List<Driver> findByStatusId(int statusId);
}
