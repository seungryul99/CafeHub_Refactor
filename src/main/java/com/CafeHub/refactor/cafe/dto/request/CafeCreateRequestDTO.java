package com.CafeHub.refactor.cafe.dto.request;

import com.CafeHub.refactor.cafe.entity.Theme;
import lombok.*;

// 복합값 타입 테스트용 임시 코드

@Getter
@Setter
@Builder
public class CafeCreateRequestDTO {

    private String name;

    private Theme theme;

    private String address;

    private String phone;

    private String operationHours;

    private String closeDays;

    private String photoUrl;

    private String photoKey;

}
