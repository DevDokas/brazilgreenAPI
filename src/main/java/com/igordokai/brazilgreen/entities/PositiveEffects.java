package com.igordokai.brazilgreen.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "positive_effects")
public class PositiveEffects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String icon;
    @ManyToMany(mappedBy = "strain_positive_effects")
    private Set<Strain> strain = new HashSet<>();

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public Set<Strain> getStrain() {
        return strain;
    }
    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setStrain(Set<Strain> strain) {
        this.strain = strain;
    }
}
