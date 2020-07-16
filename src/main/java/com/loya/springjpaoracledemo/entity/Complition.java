package com.loya.springjpaoracledemo.entity;

import javax.persistence.*;

@Entity
@Table(name="COMPLITION_TABLE")
public class Complition {

    @Id
    @Column(name = "ORIGINAL_NAME", nullable = false, length = 255)
    private String originalName;

    @Column(name = "DISIPLAY_NAME", nullable = false, length = 255)
    private String displayName;


    public Complition(String originalName, String  displayName) {
        this.originalName = originalName;
        this.displayName= displayName;
    }

    protected Complition() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    @Override
    public String toString() {
        return "Complition{" +
                "original name=" + originalName +
                ", display name='" + displayName + '\'' +
                '}';
    }
}
