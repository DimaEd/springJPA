package com.shema;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "roles_id", referencedColumnName = "id")
    private Roles roles;

    @OneToOne(mappedBy = "user")
    private Schoolboy schoolboy;

    @OneToMany(mappedBy = "user")
    private Set<Grades> grades;

    @OneToOne(mappedBy = "user")
    private Teachers teachers;

    private String first_name;
    private String last_name;

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    public Set<Grades> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grades> grades) {
        this.grades = grades;
    }

    public Schoolboy getSchoolboy() {
        return schoolboy;
    }

    public void setSchoolboy(Schoolboy schoolboy) {
        this.schoolboy = schoolboy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", roles=" + roles +
                ", schoolboy=" + schoolboy +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }
}
