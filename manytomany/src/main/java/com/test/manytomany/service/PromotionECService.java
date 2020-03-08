package com.test.manytomany.service;

import com.test.manytomany.domain.Promotion;
import com.test.manytomany.repository.PromotionECRepository;
import com.test.manytomany.repository.PromotionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionECService {

    private final Logger log = LoggerFactory.getLogger(PromotionECService.class);

    private final PromotionECRepository promotionECRepository;
    private final PromotionRepository promotionRepository;

    @Autowired
    @Lazy
    public PromotionECService(PromotionECRepository promotionECRepository, PromotionRepository promotionRepository) {
        this.promotionECRepository = promotionECRepository;
        this.promotionRepository = promotionRepository;
    }

    public List<Promotion> foo(){

        return promotionRepository.findAll();

    }

}
