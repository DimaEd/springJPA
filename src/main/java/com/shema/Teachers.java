package com.shema;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table

public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany(mappedBy = "teachers")
    private Set<Disciplines> disciplines;

   @OneToOne()
   @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    @OneToOne(mappedBy = "teachers")
    private Classes classes;

    @OneToMany(mappedBy = "teachers")
    private Set<Grades> grades;

    @OneToMany(mappedBy = "teachers")
    private Set<Sin> sins;

    public Set<Sin> getSins() {
        return sins;
    }

    public void setSins(Set<Sin> sins) {
        this.sins = sins;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Disciplines> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(Set<Disciplines> disciplines) {
        this.disciplines = disciplines;
    }

}
