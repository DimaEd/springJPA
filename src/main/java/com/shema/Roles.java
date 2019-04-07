package com.shema;


import javax.persistence.*;
import java.util.Set;

/**
 * this is Roles class associated with the database
 */

@Entity
@Table
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "roles")
    private Set<User> user;


    private String role;

    public User getUser() {
        return (User) user;
    }

    public void setUser(User user) {
        this.user = (Set<User>) user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", role='" + role + '\'' +
                '}';
    }
}