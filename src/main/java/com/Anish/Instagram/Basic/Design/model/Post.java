package com.Anish.Instagram.Basic.Design.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String postData;
    private Timestamp createdDate;
    private Timestamp updatedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
