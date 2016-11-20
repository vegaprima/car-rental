package com.rental.dao;

import com.rental.model.Unit;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by aluckyanto on 11/20/2016.
 */
public interface UnitDao extends PagingAndSortingRepository<Unit,String>{
}
