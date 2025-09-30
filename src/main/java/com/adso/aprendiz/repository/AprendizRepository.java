package com.adso.aprendiz.repository;

import com.adso.aprendiz.entity.AprendizEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AprendizRepository extends JpaRepository<AprendizEntity, Long> {
}
