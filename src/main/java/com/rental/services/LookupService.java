package com.rental.services;

import com.rental.models.Lookup;

import java.util.List;

/**
 * Created by aluckyanto on 11/22/2016.
 */
public interface LookupService {
    public void save(Lookup lookup);
    public List<Lookup> findByCodeIgnoreCase(String code);
    public List<Lookup> findAll();
    public List<Lookup> findByIdNot(Integer id);
    public Lookup findById(Integer id);
    public void delete(Integer id);
}
