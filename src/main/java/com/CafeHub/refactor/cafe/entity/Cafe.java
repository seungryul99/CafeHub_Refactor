package com.CafeHub.refactor.cafe.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Cafe {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "cafe_id")
    private Long id;

    private String name;

    private Theme theme;

    private String address;

    private String phone;

    private String operationHours;

    private String closeDays;

    private String photoUrl;

    private String photoKey;

    private Double rating;

    private Integer reviewCnt;



}