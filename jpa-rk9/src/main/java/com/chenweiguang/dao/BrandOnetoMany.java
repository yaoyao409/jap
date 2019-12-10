package com.chenweiguang.dao;

import com.chenweiguang.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandOnetoMany extends JpaRepository<Brand,Integer> {
}
