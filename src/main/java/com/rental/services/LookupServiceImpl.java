package com.rental.services;

import com.rental.models.Lookup;
import com.rental.repositories.LookupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aluckyanto on 11/22/2016.
 */
@Service
public class LookupServiceImpl implements LookupService {

    @Autowired
    private LookupRepository lookupRepository;

    @Override
    public void save(Lookup lookup) {
        lookup.setCode(lookup.getCode().toUpperCase());
        lookupRepository.save(lookup);
    }

    @Override
    public List<Lookup> findByCodeIgnoreCase(String code) {
        return lookupRepository.findByCodeIgnoreCase(code);
    }

    @Override
    public List<Lookup> findAll() {
        return lookupRepository.findAll();
    }

    @Override
    public Lookup findById(Integer id) {
        return lookupRepository.findOne(id);
    }

    @Override
    public List<Lookup> findByIdNot(Integer id) {
        return lookupRepository.findByIdNot(id);
    }

    @Override
    public void delete(Integer id) {
        lookupRepository.delete(id);
    }
}
