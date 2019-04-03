package com.shema;

import javax.persistence.*;

@Entity
@Table
public class Disciplines {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schedule_id",nullable = false)
    private Schedule schedule;

    @ManyToOne
    @JoinColumn(name = "teachers_id",nullable = false)
    private Teachers teachers;

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    private String name_subject;

    public Long getId() {
        return id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public String getName_subject() {
        return name_subject;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setName_subject(String name_subject) {
        this.name_subject = name_subject;
    }

    @Override
    public String toString() {
        return "Disciplines{" +
                "id=" + id +
                ", name_subject='" + name_subject + '\'' +
                '}';
    }
}
