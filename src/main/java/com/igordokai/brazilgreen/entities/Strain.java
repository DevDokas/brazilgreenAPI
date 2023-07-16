package com.igordokai.brazilgreen.entities;

import javax.persistence.*;

@Entity
@Table(name = "strains")
public class Strain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    private Long kind_id;
    private String description;
    private Long flavors_list_id;
    private Long helps_with_id;
    private Long positive_effects_list_id;
    private Long negative_effects_list_id;
    private Long terpenes_list_id;
    private Float thc_concentration;
    private Float cbd_concentration;
    private String image;
    private String created_at;
    private String updated_at;

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getKind_id() {
        return kind_id;
    }

    public String getDescription() {
        return description;
    }

    public Long getFlavors_list_id() {
        return flavors_list_id;
    }

    public Long getHelps_with_id() {
        return helps_with_id;
    }

    public Long getPositive_effects_list_id() {
        return positive_effects_list_id;
    }

    public Long getNegative_effects_list_id() {
        return negative_effects_list_id;
    }

    public Long getTerpenes_list_id() {
        return terpenes_list_id;
    }

    public Float getThc_concentration() {
        return thc_concentration;
    }

    public Float getCbd_concentration() {
        return cbd_concentration;
    }

    public String getImage() {
        return image;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind_id(Long kind_id) {
        this.kind_id = kind_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFlavors_list_id(Long flavors_list_id) {
        this.flavors_list_id = flavors_list_id;
    }

    public void setHelps_with_id(Long helps_with_id) {
        this.helps_with_id = helps_with_id;
    }

    public void setPositive_effects_list_id(Long positive_effects_list_id) {
        this.positive_effects_list_id = positive_effects_list_id;
    }

    public void setNegative_effects_list_id(Long negative_effects_list_id) {
        this.negative_effects_list_id = negative_effects_list_id;
    }

    public void setTerpenes_list_id(Long terpenes_list_id) {
        this.terpenes_list_id = terpenes_list_id;
    }

    public void setThc_concentration(Float thc_concentration) {
        this.thc_concentration = thc_concentration;
    }

    public void setCbd_concentration(Float cbd_concentration) {
        this.cbd_concentration = cbd_concentration;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
