package com.shema;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Grades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JoinColumn(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "grades" ,cascade = CascadeType.ALL,orphanRemoval = true)
    private Set<Schedule> schedule;
    @ManyToOne
    @JoinColumn(name = "teachers_id", nullable = false)
    private Teachers teachers;

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    private String subject;
    private Long grade;
    private String date;

    public Set<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(Set<Schedule> schedule) {
        this.schedule = schedule;
    }

    public Grades() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public String getSubject(String english) {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getGrade() {
        return grade;
    }

    public void setGrade(Long grade) {
        this.grade = grade;
    }

    public String getDate(String s) {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Grades{" +
                "id=" + id +
                ", user=" + user +
                ", schedule=" + schedule +
                ", teachers=" + teachers +
                ", subject='" + subject + '\'' +
                ", grade=" + grade +
                ", date='" + date + '\'' +
                '}';
    }
}
