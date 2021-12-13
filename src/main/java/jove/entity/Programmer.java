package jove.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Programmer {

    @Id
    @GeneratedValue
    private int programmer_Id;

    @Column(nullable = false)
    private String programmer_name;

    @Column
    private Integer experience;

    @Column
    private String known_language;

    @Column
    private String specializations;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String date_of_joining;

    @ManyToOne
    @JoinColumn(name = "software_id")
    private Software software;


    public Programmer() {
    }

    public Programmer(String programmer_name, Integer experience, String known_language, String specializations, String date_of_joining, String username, String password, Software software) {
        this.programmer_name = programmer_name;
        this.experience = experience;
        this.known_language = known_language;
        this.specializations = specializations;
        this.date_of_joining = date_of_joining;
        this.username = username;
        this.password = password;
        this.software = software;
    }

    public int getProgrammer_Id() {
        return programmer_Id;
    }

    public String getProgrammer_name() {
        return programmer_name;
    }

    public void setProgrammer_name(String programmer_name) {
        this.programmer_name = programmer_name;
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

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmer_Id=" + programmer_Id +
                ", programmer_name='" + programmer_name + '\'' +
                ", experience=" + experience +
                ", known_language='" + known_language + '\'' +
                ", specializations='" + specializations + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", date_of_joining='" + date_of_joining + '\'' +
                ", software=" + software +
                '}';
    }
}
