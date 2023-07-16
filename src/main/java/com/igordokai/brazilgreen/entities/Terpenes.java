package com.igordokai.brazilgreen.entities;

import javax.persistence.*;

@Entity
@Table(name = "terpenes")
public class Terpenes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String short_description;
    private String description;

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShort_description() {
        return short_description;
    }

    public String getDescription() {
        return description;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
