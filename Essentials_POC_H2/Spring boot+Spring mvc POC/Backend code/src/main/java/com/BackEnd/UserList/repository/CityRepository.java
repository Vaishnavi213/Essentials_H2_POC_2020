package com.BackEnd.UserList.repository;


import com.BackEnd.UserList.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CityRepository extends JpaRepository<City, Long> {
}
