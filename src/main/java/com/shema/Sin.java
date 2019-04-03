package com.shema;

import javax.persistence.*;

@Entity
@Table
public class Sin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schoolboy_id",nullable = false)
    private Schoolboy schoolboy;

    @ManyToOne
    @JoinColumn(name = "teachers_id", nullable = false)
    private Teachers teachers;

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

    private String type_sin;
    private Long points;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Schoolboy getSchoolboy() {
        return schoolboy;
    }

    public void setSchoolboy(Schoolboy schoolboy) {
        this.schoolboy = schoolboy;
    }

    public String getType_sin() {
        return type_sin;
    }

    public void setType_sin(String type_sin) {
        this.type_sin = type_sin;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Sin{" +
                "id=" + id +
                ", schoolboy=" + schoolboy +
                ", teachers=" + teachers +
                ", type_sin='" + type_sin + '\'' +
                ", points=" + points +
                '}';
    }
}
