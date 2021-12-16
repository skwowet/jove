package jove.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProjectLead {
    @Id
    @GeneratedValue
    private int projectLeadId;

    @Column(nullable = false)
    private String projectLead_name;

    @Column
    private Integer experience;

    @Column
    private String known_language;

    @Column
    private String specializations;

    @Column
    private String date_of_joining;

    @Column
    private String username;

    @Column
    private String password;

    @ManyToOne
    @JoinColumn(name = "software_id")
    private Software software;


    public ProjectLead() {
    }

    public ProjectLead(String projectLead_name, Integer experience, String known_language, String specializations, String date_of_joining, String username, String password, Software software) {
        this.projectLead_name = projectLead_name;
        this.experience = experience;
        this.known_language = known_language;
        this.specializations = specializations;
        this.date_of_joining = date_of_joining;
        this.username = username;
        this.password = password;
        this.software = software;
    }

    public int getProjectLeadId() {
        return projectLeadId;
    }


    public String getProjectLead_name() {
        return projectLead_name;
    }

    public void setProjectLead_name(String projectLead_name) {
        this.projectLead_name = projectLead_name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getKnown_language() {
        return known_language;
    }

    public void setKnown_language(String known_language) {
        this.known_language = known_language;
    }

    public String getSpecializations() {
        return specializations;
    }

    public void setSpecializations(String specializations) {
        this.specializations = specializations;
    }

    public String getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(String date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
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
        return "ProjectLead{" +
                "projectLeadId=" + projectLeadId +
                ", projectLead_name='" + projectLead_name + '\'' +
                ", experience=" + experience +
                ", known_language='" + known_language + '\'' +
                ", specializations='" + specializations + '\'' +
                ", date_of_joining='" + date_of_joining + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", software=" + software +
                '}';
    }


}

