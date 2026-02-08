package com.jjs.memoboard.Domain;

import com.jjs.memoboard.Domain.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Getter
@NoArgsConstructor
@Table(name = "note")
@Entity
public class note extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private Long id;

    @Column(name = "title")
    private String titme;

    @Column(name = "content")
    private String content;
}
