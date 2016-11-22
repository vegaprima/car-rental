package com.rental.repositories;

import com.rental.models.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aluckyanto on 11/20/2016.
 */
public interface UnitRepository extends JpaRepository<Unit, String> {

}
