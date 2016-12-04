package com.rental.repositories;

import com.rental.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aluckyanto on 12/4/2016.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
