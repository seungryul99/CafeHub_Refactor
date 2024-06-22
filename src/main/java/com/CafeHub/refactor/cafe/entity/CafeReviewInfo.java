package com.CafeHub.refactor.cafe.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CafeReviewInfo {

    // ERD 설계때 반정규화를 통해 직접 관리해줘야하는 카페의 Review info

    private Double rating;

    private Integer reviewCnt;


    public static CafeReviewInfo initCafeReviewInfo(){

        CafeReviewInfo reviewInfo = CafeReviewInfo.builder()
                .rating((double) 0)
                .reviewCnt(0)
                .build();

        return reviewInfo;
    }
}
