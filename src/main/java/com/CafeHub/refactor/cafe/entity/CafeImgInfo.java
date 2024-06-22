package com.CafeHub.refactor.cafe.entity;

import com.CafeHub.refactor.cafe.dto.request.CafeCreateRequestDTO;
import jakarta.persistence.Embeddable;
import lombok.*;


@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CafeImgInfo {

    // S3 이미지 저장소 사용과 관련된 Img info

    private String photoUrl;

    private String photoKey;

    public static CafeImgInfo initCafeImgInfo(CafeCreateRequestDTO dto){

            CafeImgInfo imgInfo = CafeImgInfo.builder()
                    .photoUrl(dto.getPhotoUrl())
                    .photoKey(dto.getPhotoKey())
                    .build();

            return imgInfo;
    }

}
