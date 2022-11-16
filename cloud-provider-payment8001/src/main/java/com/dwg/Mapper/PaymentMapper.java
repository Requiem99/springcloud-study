package com.dwg.Mapper;

import com.dwg.Entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {

    List getPaymentList();

    Payment findPaymentById(Long id);

    Long createPayment(Payment payment);

}
