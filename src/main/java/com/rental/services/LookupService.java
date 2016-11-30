package com.rental.services;

import com.rental.models.Lookup;

import java.util.List;

/**
 * Created by aluckyanto on 11/22/2016.
 */
public interface LookupService {
    public void lookupSave(Lookup lookup);
    public List<Lookup> findByCodeIgnoreCase(String code);
    public List<Lookup> lookupFindAll();
    public Lookup lookupFindById(Integer id);
    public void lookupDelete(Integer id);
}
