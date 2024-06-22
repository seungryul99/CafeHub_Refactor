package com.CafeHub.refactor.review.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReviewSubInfo {

    // ERD 설계때 반정규화를 통해 직접 관리해줘야하는 리뷰의 sub info

    private Integer likeCount;

    private Integer commentCount;

    private String writer;
}
