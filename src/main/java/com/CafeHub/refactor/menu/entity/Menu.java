package com.CafeHub.refactor.menu.entity;

import com.CafeHub.refactor.cafe.entity.Cafe;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long id;

    private Category category;

    private String name;

    private Integer price;

    private Boolean isBest;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;

}
