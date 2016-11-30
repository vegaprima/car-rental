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
    public void lookupSave(Lookup lookup) {
        lookupRepository.save(lookup);
    }

    @Override
    public List<Lookup> findByCodeIgnoreCase(String code) {
        return lookupRepository.findByCodeIgnoreCase(code);
    }

    @Override
    public List<Lookup> lookupFindAll() {
        return lookupRepository.findAll();
    }

    @Override
    public Lookup lookupFindById(Integer id) {
        return lookupRepository.findOne(id);
    }

    @Override
    public void lookupDelete(Integer id) {
        lookupRepository.delete(id);
    }
}
