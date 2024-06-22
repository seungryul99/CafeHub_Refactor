package com.CafeHub.refactor.cafe.entity;

import com.CafeHub.refactor.cafe.dto.request.CafeCreateRequestDTO;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CafeBasicInfo {

    private String name;

    private Theme theme;

    private String address;

    private String phone;

    private String operationHours;

    private String closeDays;


    public static CafeBasicInfo initCafeBasicInfo(CafeCreateRequestDTO dto){

        CafeBasicInfo basicInfo = CafeBasicInfo.builder()
                .name(dto.getName())
                .theme(dto.getTheme())
                .address(dto.getAddress())
                .phone(dto.getPhone())
                .operationHours(dto.getOperationHours())
                .closeDays(dto.getCloseDays())
                .build();

        return basicInfo;
    }
}
