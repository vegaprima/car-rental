package com.rental.repositories;

import com.rental.models.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aluckyanto on 11/20/2016.
 */
@Repository
public interface UnitRepository extends JpaRepository<Unit, String> {

}
