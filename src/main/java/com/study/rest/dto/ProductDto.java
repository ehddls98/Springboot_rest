package com.study.rest.dto;

import com.study.rest.entity.Product;
import lombok.Builder;
import lombok.Data;

public class ProductDto {

    @Builder
    public static class CommonResponse {

    }

    @Data
    public static class Register {
        private String productName;
        private int price;
        private int sizeId;
        private int colorId;

        public Product toEntity() {
            return Product.builder()
                    .productName(productName)
                    .price(price)
                    .sizeId(sizeId)
                    .colorId(colorId)
                    .build();
        }
    }
}
