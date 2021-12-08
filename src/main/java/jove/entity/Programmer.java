package jove.entity;

import javax.persistence.*;

@Entity
public class Programmer {

    @Id
    @GeneratedValue
    private Long programmer_Id;

    @Column(nullable = false)
    private String programmer_name;

    @Column
    private Long experience;

    @Column
    private String known_language;

    @Column
    private String specializations;

    @Column
    private String date_of_joining;


    public Programmer() {
    }

    public Programmer(String programmer_name, Long experience, String known_language, String specializations, String date_of_joining) {
        this.programmer_name = programmer_name;
        this.experience = experience;
        this.known_language = known_language;
        this.specializations = specializations;
        this.date_of_joining = date_of_joining;
    }

    public Long getProgrammer_Id() {
        return programmer_Id;
    }

    public void setProgrammer_Id(Long programmer_Id) {
        this.programmer_Id = programmer_Id;
    }

    public String getProgrammer_name() {
        return programmer_name;
    }

    public void setProgrammer_name(String programmer_name) {
        this.programmer_name = programmer_name;
    }

    public Long getExperience() {
        return experience;
    }

    public void setExperience(Long experience) {
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

    @Override
    public String toString() {
        return "Programmer{" +
                "programmer_Id=" + programmer_Id +
                ", programmer_name='" + programmer_name + '\'' +
                ", experience=" + experience +
                ", known_language='" + known_language + '\'' +
                ", specializations='" + specializations + '\'' +
                ", date_of_joining='" + date_of_joining + '\'' +
                '}';
    }
}
