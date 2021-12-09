package jove.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Long owner_id;

    @Column(length=100)
    private String owner_name;


    public Owner() {
    }

    public Owner(String owner_name) {
        this.owner_name = owner_name;
    }

    public Long getOwner_id() {
        return owner_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    @Override
    public String toString() {
        return "Owner [owner_id=" + owner_id + ", owner_name=" + owner_name + "]";
    }

}
