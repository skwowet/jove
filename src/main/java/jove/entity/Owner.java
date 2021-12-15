package jove.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private int owner_id;

    @Column(length=100)
    private String owner_name;

    @Column
    private String username;


    public Owner() {
    }

    public Owner(String owner_name, String username) {
        this.owner_name = owner_name;
        this.username = username;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Owner{" + "owner_id=" + owner_id + ", owner_name=" + owner_name + ", username=" + username + '}';
    }

}
