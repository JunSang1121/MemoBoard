package com.jjs.memoboard.Domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "user_name", length = 5, nullable = false)
    private String name;

    @Column(name = "user_email", length = 100)
    private String email;

    @Builder
    public User(String name, String email){
        this.email = email;
        this.name = name;
    }
}
