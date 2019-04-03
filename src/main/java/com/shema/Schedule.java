package com.shema;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "grade_id",referencedColumnName = "id")
    private Grades grades;

    @OneToMany(mappedBy = "schedule")
    private Set<Disciplines> disciplines;



    private String monday;
    private String thursday;
    private String wednesday;
    private String tuesday;
    private String friday;

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public Set<Disciplines> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<Disciplines> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", monday='" + monday + '\'' +
                ", thursday='" + thursday + '\'' +
                ", wednesday='" + wednesday + '\'' +
                ", tuesday='" + tuesday + '\'' +
                ", friday='" + friday + '\'' +
                '}';
    }
}
