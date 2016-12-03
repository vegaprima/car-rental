package com.rental.models;

import javax.persistence.*;

/**
 * Created by aluckyanto on 11/22/2016.
 */
@Entity
@Table(name = "lookup")
public class Lookup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "parent")
    private Lookup parent;
    private String code;
    private String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lookup getParent() {
        return parent;
    }

    public void setParent(Lookup parent) {
        this.parent = parent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
