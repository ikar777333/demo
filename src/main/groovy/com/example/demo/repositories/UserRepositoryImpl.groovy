package com.example.demo.repositories

import com.example.demo.entities.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepositoryImpl extends CrudRepository<User, Long> {

    User findById(long id);

}
