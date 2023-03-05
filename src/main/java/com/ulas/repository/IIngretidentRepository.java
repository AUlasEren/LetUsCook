package com.ulas.repository;

import com.ulas.repository.entity.Ingretident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngretidentRepository extends JpaRepository<Ingretident,Long> {
}
