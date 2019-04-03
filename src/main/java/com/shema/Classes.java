package com.shema;

import javax.persistence.*;

@Entity
@Table
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;
    @OneToOne(mappedBy = "classes")
    private Schoolboy schoolboy;

    @OneToOne(cascade = CascadeType.ALL)
    private Teachers teachers;

    private String class_name;
    private String classroom_teacher;

    public Teachers getTeachers() {
        return teachers;
    }

    public void setTeachers(Teachers teachers) {
        this.teachers = teachers;
    }

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

    public String getClasses_name() {
        return class_name;
    }

    public void setClasses_name(String classes_name) {
        this.class_name = classes_name;
    }

    public String getClassroom_teacher() {
        return classroom_teacher;
    }

    public void setClassroom_teacher(String classroom_teacher) {
        this.classroom_teacher = classroom_teacher;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", schoolboy=" + schoolboy +
                ", teachers=" + teachers +
                ", class_name='" + class_name + '\'' +
                ", classroom_teacher='" + classroom_teacher + '\'' +
                '}';
    }
}
