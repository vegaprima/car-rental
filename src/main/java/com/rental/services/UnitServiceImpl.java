package com.rental.services;

import com.rental.models.Unit;
import com.rental.repositories.UnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aluckyanto on 11/22/2016.
 */
@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository unitRepository;


    @Override
    public void unitSave(Unit unit) {
        unitRepository.save(unit);
    }
}
