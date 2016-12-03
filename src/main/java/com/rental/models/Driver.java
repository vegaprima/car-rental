package com.rental.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by aluckyanto on 12/3/2016.
 */
@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToOne
    @JoinColumn(name = "gender_id")
    private Lookup gender;

    private String placeOfBirth;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfBirth;

    private String telp;

    private String address;

    @OneToOne
    @JoinColumn(name = "province_id")
    private Lookup province;

    @OneToOne
    @JoinColumn(name = "city_id")
    private Lookup city;

    @OneToOne
    @JoinColumn(name = "license_type_id")
    private Lookup licenseType;

    private Integer yearsOfExperience;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Lookup status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lookup getGender() {
        return gender;
    }

    public void setGender(Lookup gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Lookup getProvince() {
        return province;
    }

    public void setProvince(Lookup province) {
        this.province = province;
    }

    public Lookup getCity() {
        return city;
    }

    public void setCity(Lookup city) {
        this.city = city;
    }

    public Lookup getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(Lookup licenseType) {
        this.licenseType = licenseType;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public Lookup getStatus() {
        return status;
    }

    public void setStatus(Lookup status) {
        this.status = status;
    }
}
