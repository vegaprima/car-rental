package com.rental.repositories;

import com.rental.models.Lookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by aluckyanto on 11/22/2016.
 */
@Repository
public interface LookupRepository extends JpaRepository<Lookup, String> {
    public List<Lookup> findByCodeIgnoreCase(String code);
}
