package com.dubbo.provider.pojo;

import lombok.*;

import java.io.Serializable;


/**
 * @author binSin
 * @date 2022/3/30
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
}

