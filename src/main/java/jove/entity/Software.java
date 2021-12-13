package jove.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Software {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name="software_id", referencedColumnName="software_id"),
            @JoinColumn(name="software_name", referencedColumnName="software_name")
    })
    private ProjectOrder projectOrder;

    @Column
    private String status;

    @Column
    private String release_date;

    @Column
    private String commencement_date;

    @OneToMany(mappedBy = "software", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<ProjectLead> listProjectLeads;

    @OneToMany(mappedBy = "software", fetch = FetchType.LAZY, orphanRemoval = false)
    private List<Programmer> listProgrammers;

    public Software() {
    }

    public Software(String status, String release_date, String commencement_date, ProjectOrder projectOrder) {
        this.status = status;
        this.release_date = release_date;
        this.commencement_date = commencement_date;
        this.projectOrder = projectOrder;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getCommencement_date() {
        return commencement_date;
    }

    public void setCommencement_date(String commencement_date) {
        this.commencement_date = commencement_date;
    }

    public ProjectOrder getProjectOrder() {
        return projectOrder;
    }

    public void setProjectOrder(ProjectOrder projectOrder) {
        this.projectOrder = projectOrder;
    }

    public List<ProjectLead> getListProjectLeads() {
        return listProjectLeads;
    }

    public void setListProjectLeads(List<ProjectLead> listProjectLeads) {
        this.listProjectLeads = listProjectLeads;
    }

    public List<Programmer> getListProgrammers() {
        return listProgrammers;
    }

    public void setListProgrammers(List<Programmer> listProgrammers) {
        this.listProgrammers = listProgrammers;
    }

    @Override
    public String toString() {
        return "Software{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", release_date='" + release_date + '\'' +
                ", commencement_date='" + commencement_date + '\'' +
                ", projectOrder=" + projectOrder +
                '}';
    }
}
