package com.test.manytomany.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "promotion")
public class Promotion {

    @Id
    private Long id;

    private String name;

    // https://stackoverflow.com/a/18288939
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "promotions_ecs",
            joinColumns = { @JoinColumn(name = "promotion_id") },
            inverseJoinColumns = { @JoinColumn(name = "ec_id") })
    private Set<CommercialEstablishment> ecs = new HashSet<>();

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

    public Set<CommercialEstablishment> getEcs() {
        return ecs;
    }

    public void setEcs(Set<CommercialEstablishment> ecs) {
        this.ecs = ecs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Promotion promotion = (Promotion) o;
        return Objects.equals(id, promotion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Promotion{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
//        sb.append(", ecs='").append(ecs).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
