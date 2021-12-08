package jove.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long client_id;

    @Column
    private String client_name;

    @Column
    private String phone_number;

    @Column
    private String username;

    @Column
    private String password;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Project> listProjects = new ArrayList<>();

    public Client() {
    }

    public Client(String client_name, String phone_number, String username, String password) {
        this.client_name = client_name;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
    }

    public Long getClient_id() {
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

    @Override
    public String toString() {
        return "Client[" + "client_name=" + client_name + ", phone_number=" + phone_number + ", username=" + username + ", password=" + password + ']';
    }
}