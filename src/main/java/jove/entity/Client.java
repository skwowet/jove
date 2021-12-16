package jove.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private int client_id;

    @Column
    private String client_name;

    @Column
    private Long phone_number;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String address;


    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY, orphanRemoval = false)
    @JsonIgnore
    private List<ProjectOrder> listProjects = new ArrayList<>();

    public Client() {
    }

    public Client(String client_name, Long phone_number, String username, String password, String address) {
        this.client_name = client_name;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
        this.address = address;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public Long getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(Long phone_number) {
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

    public List<ProjectOrder> getListProjects() {
        return listProjects;
    }

    public void addProjectOrder(ProjectOrder projectOrder) {
        listProjects.add(projectOrder);
    }

    public void removeProjectOrder(ProjectOrder projectOrder) {
        listProjects.remove(projectOrder);
    }

    public void removeProjectOrder(int index) {
        listProjects.remove(index);
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
                ", listProjects=" + listProjects +
                ']';
    }
}