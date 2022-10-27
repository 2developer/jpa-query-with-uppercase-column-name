package com.tobedeveloper.jpaqueryexample.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_TBL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "STATUS")
    private Integer status;

}
