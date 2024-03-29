package com.studycloud.server.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;
    private String status;

    ProductStatusEnum(Integer code, String status) {
        this.code = code;
        this.status = status;
    }
}
