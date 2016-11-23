package com.rental.models;

import javax.persistence.*;

/**
 * Created by aluckyanto on 11/20/2016.
 */
@Entity
@Table(name = "unit")
public class Unit {

    @Id
    @SequenceGenerator(name = "unit_id_seq",sequenceName = "unit_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "unit_id_seq")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "brand_id")
    private Lookup brand;

    @OneToOne
    @JoinColumn(name = "type_id")
    private Lookup type;

    private Integer year;

    private String policeNumber;

    @OneToOne
    @JoinColumn(name = "trans_id")
    private Lookup transmission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lookup getBrand() {
        return brand;
    }

    public void setBrand(Lookup brand) {
        this.brand = brand;
    }

    public Lookup getType() {
        return type;
    }

    public void setType(Lookup type) {
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPoliceNumber() {
        return policeNumber;
    }

    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber;
    }

    public Lookup getTransmission() {
        return transmission;
    }

    public void setTransmission(Lookup transmission) {
        this.transmission = transmission;
    }
}
