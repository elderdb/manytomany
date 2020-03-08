package com.test.manytomany.resource;

import com.test.manytomany.service.PromotionECService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manytomany")
public class PromotionECResource {

    private PromotionECService promotionECService;

    @Autowired
    @Lazy
    public PromotionECResource(PromotionECService promotionECService) {
        this.promotionECService = promotionECService;
    }

    @GetMapping(value = "/getPromotionECs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getPromotionECs(){

        return ResponseEntity.ok(promotionECService.foo());

    }

}
