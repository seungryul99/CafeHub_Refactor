package com.CafeHub.refactor.review.entity;


import com.CafeHub.refactor.cafe.entity.Cafe;
import com.CafeHub.refactor.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Review {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;


    @Lob
    private String content;

    private Integer rating;

    private Integer likeCount;

    private Integer commentCount;

    private String writer;

    private String reviewPhotos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


}
