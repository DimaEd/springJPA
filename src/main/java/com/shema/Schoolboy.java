package com.shema;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Schoolboy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "classes_id",referencedColumnName = "id")
    private Classes classes;

    @OneToMany(mappedBy = "schoolboy",fetch = FetchType.LAZY)
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

    @Override
    public String toString() {
        return "Schoolboy{" +
                "id=" + id +
                ", user=" + user +
                ", classes=" + classes +
                ", sins=" + sins +
                '}';
    }
}