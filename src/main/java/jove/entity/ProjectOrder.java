package jove.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
public class ProjectOrder implements Serializable {

    @Id
    @GeneratedValue
    private int software_id;

    @Column(length=100)
    private String software_name;

    @Column(length=100)
    private String software_type;

    @Column(length=100)
    private String project_status;

    @Column
    private String date_of_order;

    @Column
    private String due_date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    @JsonIgnore
    private Client client;

    @OneToMany(mappedBy = "projectOrder")
    private List<Software> listSoftwares;


    public ProjectOrder() {
    }

    public ProjectOrder(String software_name, String software_type, String project_status, String date_of_order, String due_date, Client client) {
        this.software_name = software_name;
        this.software_type = software_type;
        this.project_status = project_status;
        this.date_of_order = date_of_order;
        this.due_date = due_date;
        this.client = client;
    }

    public int getSoftware_id() {
        return software_id;
    }

    public void setSoftware_id(Integer software_id) {
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

    public String getProject_status() {
        return project_status;
    }

    public void setProject_status(String project_status) {
        this.project_status = project_status;
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
        return "ProjectOrder{" +
                "software_id=" + software_id +
                ", software_name='" + software_name + '\'' +
                ", software_type='" + software_type + '\'' +
                ", project_status='" + project_status + '\'' +
                ", date_of_order='" + date_of_order + '\'' +
                ", due_date='" + due_date + '\'' +
                ", client=" + client +
                '}';
    }
}


