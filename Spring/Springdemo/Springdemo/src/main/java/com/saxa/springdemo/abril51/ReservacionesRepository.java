package com.saxa.springdemo.abril51;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionesRepository extends JpaRepository<ReservacionesEntity, Long>{

}
