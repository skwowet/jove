package jove.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Software {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="software_id", referencedColumnName="software_id"),
            @JoinColumn(name="software_name", referencedColumnName="software_name")
    })
    private ProjectOrder projectOrder;

    @Column
    private String status;

    @Column
    private java.sql.Date release_date;

    @Column
    private java.sql.Date commencement_date;

    @OneToMany(mappedBy = "software", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<ProjectLead> listProjectLeads;

    @OneToMany(mappedBy = "software", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Programmer> listProgrammers;

    public Software() {
    }

    public Software(String status, java.sql.Date release_date, java.sql.Date commencement_date, ProjectOrder projectOrder) {
        this.status = status;
        this.release_date = release_date;
        this.commencement_date = commencement_date;
        this.projectOrder = projectOrder;
    }

    public Long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.sql.Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(java.sql.Date release_date) {
        this.release_date = release_date;
    }

    public java.sql.Date getCommencement_date() {
        return commencement_date;
    }

    public void setCommencement_date(java.sql.Date commencement_date) {
        this.commencement_date = commencement_date;
    }

    public ProjectOrder getProjectOrder() {
        return projectOrder;
    }

    public void setProjectOrder(ProjectOrder projectOrder) {
        this.projectOrder = projectOrder;
    }


    @Override
    public String toString() {
        return "Software{" +
                "projectOrder=" + projectOrder +
                ", status='" + status + '\'' +
                ", release_date='" + release_date + '\'' +
                ", commencement_date='" + commencement_date + '\'' +
                '}';
    }
}
