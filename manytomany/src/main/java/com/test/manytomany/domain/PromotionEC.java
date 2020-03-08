package com.test.manytomany.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "promotions_ecs")
public class PromotionEC {

    @EmbeddedId
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionEC promotion = (PromotionEC) o;
        return Objects.equals(id, promotion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PromotionEC{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
