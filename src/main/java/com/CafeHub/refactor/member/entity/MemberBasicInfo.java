package com.CafeHub.refactor.member.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class MemberBasicInfo {

    private String username;

    private String nickname;

    private String email;

    private Role role;

}
