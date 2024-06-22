package com.CafeHub.refactor.member.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberImgInfo {

    // S3 이미지 저장소 사용과 관련된 Img info

    private String photoUrl;

    private String photoKey;
}
