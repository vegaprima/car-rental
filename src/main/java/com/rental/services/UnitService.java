package com.rental.services;

import com.rental.models.Unit;

import java.util.List;

/**
 * Created by aluckyanto on 11/21/2016.
 */
public interface UnitService {
    public void save(Unit unit);
    public List<Unit> findAll();
    public Unit findById(Integer id);
    public void delete(Integer id);

}
