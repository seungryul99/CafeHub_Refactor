package com.CafeHub.refactor.review.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.*;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ReviewMainInfo {

    // 사용자가 직접 접근 할 수 있는 리뷰의 Main info

    @Lob
    private String content;

    private Integer rating;
}
