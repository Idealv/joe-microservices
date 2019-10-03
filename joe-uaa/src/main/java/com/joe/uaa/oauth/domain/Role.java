package com.joe.uaa.oauth.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity
@Table(name="role")
@Getter
@Setter
@ToString
@Proxy(lazy = false)
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }
}
