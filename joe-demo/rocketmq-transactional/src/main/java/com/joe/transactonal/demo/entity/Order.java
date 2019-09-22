package com.joe.transactonal.demo.entity;

import lombok.*;

import java.io.Serializable;

@Getter@Setter@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = -118082209548679663L;

    private Long orderId;

    private String orderNo;
}
