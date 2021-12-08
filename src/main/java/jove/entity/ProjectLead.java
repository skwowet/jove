package jove.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class ProjectLead {
    @Id
    @GeneratedValue
    private Long projectLeadId;

    @Column(nullable = false)
    private String projectLead_name;

    @Column
    private Long experience;

    @Column
    private String known_language;

    @Column
    private String specializations;

    @Column
    private String date_of_joining;


}

