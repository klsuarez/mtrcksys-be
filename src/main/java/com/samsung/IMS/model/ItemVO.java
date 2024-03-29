package com.samsung.IMS.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ItemVO {
    private Long itemId;

    private String itemName;

    private String category;

    private int stockQuantity;

    private LocalDate updateDate;
}
