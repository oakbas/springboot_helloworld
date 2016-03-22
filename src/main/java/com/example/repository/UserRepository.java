package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by ozlemakbas on 18/03/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
}
