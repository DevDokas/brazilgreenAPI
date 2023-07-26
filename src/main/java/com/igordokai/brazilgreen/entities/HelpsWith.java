package com.igordokai.brazilgreen.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "helps_with")
public class HelpsWith {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "strain_helps_with")
    private Set<Strain> strain = new HashSet<>();

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setStrain(Set<Strain> strain) {
        this.strain = strain;
    }
}
