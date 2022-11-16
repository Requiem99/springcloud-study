package com.dwg.Service;

import com.dwg.Entities.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface PaymentService {

     List getPaymentList();

    Payment findPaymentById(Long id);

    Long createPayment(Payment payment);
}
