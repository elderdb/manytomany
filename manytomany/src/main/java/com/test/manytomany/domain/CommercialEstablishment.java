package com.test.manytomany.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "commercials_establishments")
public class CommercialEstablishment {

    @Id
    private Long id;

    private String name;

    // https://stackoverflow.com/a/18288939
    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "ecs")
    private Set<Promotion> promotions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        this.promotions = promotions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialEstablishment promotion = (CommercialEstablishment) o;
        return Objects.equals(id, promotion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CommercialEstablishment{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", promotions='").append(promotions).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

