package jove.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProjectOrder {

    @Id
    @GeneratedValue
    private Long software_id;

    @Column(length=100)
    private String software_name;

    @Column(length=100)
    private String software_type;

    @Column
    private String date_of_order;

    @Column
    private String due_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "projectOrder")
    private List<Software> listSoftwares;


    public ProjectOrder() {
    }

    public ProjectOrder(String software_name, String software_type, String date_of_order, String due_date, Client client) {
        this.software_name = software_name;
        this.software_type = software_type;
        this.date_of_order = date_of_order;
        this.due_date = due_date;
        this.client = client;
    }

    public Long getSoftware_id() {
        return software_id;
    }

    public void setSoftware_id(Long software_id) {
        this.software_id = software_id;
    }

    public String getSoftware_name() {
        return software_name;
    }

    public void setSoftware_name(String software_name) {
        this.software_name = software_name;
    }

    public String getSoftware_type() {
        return software_type;
    }

    public void setSoftware_type(String software_type) {
        this.software_type = software_type;
    }

    public String getDate_of_order() {
        return date_of_order;
    }

    public void setDate_of_order(String date_of_order) {
        this.date_of_order = date_of_order;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Project[" +
                "software_id=" + software_id +
                ", software_name='" + software_name + '\'' +
                ", software_type='" + software_type + '\'' +
                ", date_of_order='" + date_of_order + '\'' +
                ", due_date='" + due_date + '\'' +
                ", client=" + client +
                ']';
    }
}


