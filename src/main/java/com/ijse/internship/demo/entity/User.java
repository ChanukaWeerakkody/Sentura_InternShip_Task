package com.ijse.internship.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String id;
    private String display_name;
    private String email;
    private String given_name;
    private String middle_name;
    private String name;
    private String family_name;
    private String nickname;
    private String phoneNumber;
    private String comment;
    private int directory_id;
    private int picture_id;
    private String avatar_url;
    private Object metaData;
    private List<String> tags;
    private String presence;
    private String created_at;
    private String modified_at;
    private boolean is_supported;
    private boolean is_trashed;
}
