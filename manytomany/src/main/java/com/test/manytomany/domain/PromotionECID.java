package com.test.manytomany.domain;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class PromotionECID {

    private Long promotionId;

    private Long ecId;

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getEcId() {
        return ecId;
    }

    public void setEcId(Long ecId) {
        this.ecId = ecId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionECID that = (PromotionECID) o;
        return Objects.equals(promotionId, that.promotionId) &&
                Objects.equals(ecId, that.ecId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotionId, ecId);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PromotionECID{");
        sb.append("promotionId=").append(promotionId);
        sb.append(", ecId=").append(ecId);
        sb.append('}');
        return sb.toString();
    }
}
