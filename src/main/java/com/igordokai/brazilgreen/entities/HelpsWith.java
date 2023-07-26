package com.igordokai.brazilgreen.entities;

import javax.persistence.*;

@Entity
@Table(name = "helps_with")
public class HelpsWith {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
