package com.ll.restapistudy.domain.member.member.entity;

import com.ll.restapistudy.global.jpa.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import static lombok.AccessLevel.PROTECTED;

@Entity
@SuperBuilder
@AllArgsConstructor(access = PROTECTED)
@NoArgsConstructor(access = PROTECTED)
@Setter
@Getter
@ToString(callSuper = true)
public class Member extends BaseEntity {
    private String username;
    private String password;
    private String email;
    private String nickname;

    public String getName(){
        return nickname;
    }
}
