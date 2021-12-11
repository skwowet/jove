package jove.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Integer client_id;

    @Column
    private String client_name;

    @Column
    private String phone_number;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String address;


    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, orphanRemoval = false)
    private final List<ProjectOrder> listProjects = new ArrayList<>();

    public Client() {
    }

    public Client(String client_name, String phone_number, String username, String password, String address) {
        this.client_name = client_name;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Client[" +
                "client_id=" + client_id +
                ", client_name='" + client_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
}