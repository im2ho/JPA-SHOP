package com.kh.springdb.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.springdb.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	//상세보기나 정보 수정을 위한 메서드
	Product findProductById(int id);
	
	//페이지네이션 처리
	Page<Product> findAll(Pageable pageable);
	
}