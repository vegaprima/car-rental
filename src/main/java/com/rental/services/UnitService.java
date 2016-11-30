package com.rental.services;

import com.rental.models.Unit;

import java.util.List;

/**
 * Created by aluckyanto on 11/21/2016.
 */
public interface UnitService {
    public void unitSave(Unit unit);
    public List<Unit> unitFindAll();
    public Unit unitFindById(Integer id);
    public void unitDelete(Integer id);

}
