package com.estate.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estate.back.entity.EstateEntity;

public interface EstateRepository extends JpaRepository<EstateEntity, Integer> {

}
