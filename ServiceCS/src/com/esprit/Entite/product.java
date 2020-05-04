/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Entite;

/**
 *
 * @author feriel
 */
public class product {
private String  label,description,mark,type;
private int refenceNumber;

    public product(String label, String description, String mark, String type, int refenceNumber) {
        this.label = label;
        this.description = description;
        this.mark = mark;
        this.type = type;
        this.refenceNumber = refenceNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRefenceNumber() {
        return refenceNumber;
    }

    public void setRefenceNumber(int refenceNumber) {
        this.refenceNumber = refenceNumber;
    }

    @Override
    public String toString() {
        return "product{" + "label=" + label + ", description=" + description + ", mark=" + mark + ", type=" + type + ", refenceNumber=" + refenceNumber + '}';
    }

}
