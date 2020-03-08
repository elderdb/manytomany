package com.test.manytomany.repository;

import com.test.manytomany.domain.PromotionEC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionECRepository extends JpaRepository<PromotionEC, Long> {



}
