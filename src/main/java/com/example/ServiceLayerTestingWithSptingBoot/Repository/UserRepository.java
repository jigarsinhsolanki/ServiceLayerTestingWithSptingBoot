package com.example.ServiceLayerTestingWithSptingBoot.Repository;

import com.example.ServiceLayerTestingWithSptingBoot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
