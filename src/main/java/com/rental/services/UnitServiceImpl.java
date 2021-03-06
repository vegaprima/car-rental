package com.rental.services;

import com.rental.models.Unit;
import com.rental.repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aluckyanto on 11/22/2016.
 */
@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository unitRepository;


    @Override
    public void save(Unit unit) {
        unitRepository.save(unit);
    }

    @Override
    public List<Unit> findAll() {
        return unitRepository.findAll();
    }

    @Override
    public Unit findById(Integer id) {
        return unitRepository.findOne(id);
    }

    @Override
    public void delete(Integer id) {
        unitRepository.delete(id);
    }
}
