package com.igordokai.brazilgreen.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "strains")
public class Strain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "kind")
    private Kind kind;
    private String description;

    @ManyToMany
    @JoinTable(
            name = "strain_flavor",
            joinColumns = @JoinColumn(name = "strain_id"),
            inverseJoinColumns = @JoinColumn(name = "flavor_id")
    )
    private Set<Flavor> strain_flavor = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "strain_helps_with",
            joinColumns = @JoinColumn(name = "strain_id"),
            inverseJoinColumns = @JoinColumn(name = "helps_with_id")
    )
    private Set<HelpsWith> strain_helps_with = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "strain_positive_effects",
            joinColumns = @JoinColumn(name = "strain_id"),
            inverseJoinColumns = @JoinColumn(name = "positive_effects_id")
    )
    private Set<PositiveEffects> strain_positive_effects = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "strain_negative_effects",
            joinColumns = @JoinColumn(name = "strain_id"),
            inverseJoinColumns = @JoinColumn(name = "negative_effects_id")
    )
    private Set<NegativeEffects> strain_negative_effects = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "strain_terpenes",
            joinColumns = @JoinColumn(name = "strain_id"),
            inverseJoinColumns = @JoinColumn(name = "terpenes_id")
    )
    private Set<Terpenes> strain_terpenes = new HashSet<>();
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

    public Kind getKind() {
        return kind;
    }

    public String getDescription() {
        return description;
    }

    public Set<Flavor> getStrain_flavor() {
        return strain_flavor;
    }

    public Set<HelpsWith> getStrain_helps_with() {
        return strain_helps_with;
    }

    public Set<PositiveEffects> getStrain_positive_effects() {
        return strain_positive_effects;
    }

    public Set<NegativeEffects> getStrain_negative_effects() {
        return strain_negative_effects;
    }

    public Set<Terpenes> getStrain_terpenes() {
        return strain_terpenes;
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

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStrain_flavor(Set<Flavor> strain_flavor) {
        this.strain_flavor = strain_flavor;
    }

    public void setStrain_helps_with(Set<HelpsWith> strain_helps_with) {
        this.strain_helps_with = strain_helps_with;
    }

    public void setStrain_positive_effects(Set<PositiveEffects> strain_positive_effects) {
        this.strain_positive_effects = strain_positive_effects;
    }

    public void setStrain_negative_effects(Set<NegativeEffects> strain_negative_effects) {
        this.strain_negative_effects = strain_negative_effects;
    }

    public void setStrain_terpenes(Set<Terpenes> strain_terpenes) {
        this.strain_terpenes = strain_terpenes;
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
