package com.igordokai.brazilgreen.entities;

import javax.persistence.*;


@Entity
@Table(name = "flavors_list")
public class FlavorsList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long item_one;
    private Long item_two;
    private Long item_three;

    // Getters

    public Long getId() {
        return id;
    }

    public Long getItem_one() {
        return item_one;
    }

    public Long getItem_two() {
        return item_two;
    }

    public Long getItem_three() {
        return item_three;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setItem_one(Long item_one) {
        this.item_one = item_one;
    }

    public void setItem_two(Long item_two) {
        this.item_two = item_two;
    }

    public void setItem_three(Long item_three) {
        this.item_three = item_three;
    }
}
