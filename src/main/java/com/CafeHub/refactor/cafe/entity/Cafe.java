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

    @Embedded
    private CafeBasicInfo basicInfo;

    @Embedded
    private CafeImgInfo imgInfo;

    @Embedded
    private CafeReviewInfo reviewInfo;
}