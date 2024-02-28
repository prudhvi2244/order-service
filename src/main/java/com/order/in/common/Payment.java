package com.order.in.common;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long pid;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private Timestamp paymentDate;
    private Double amount;
    private Long orderId;
}
