package com.dwg.Service.ServiceImpl;

import com.dwg.Entities.Payment;
import com.dwg.Mapper.PaymentMapper;
import com.dwg.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    public PaymentMapper paymentMapper;

    @Override
    public List getPaymentList() {
        return paymentMapper.getPaymentList();
    }

    @Override
    public Payment findPaymentById(Long id) {
        return paymentMapper.findPaymentById(id);
    }

    @Override
    public Long createPayment(Payment payment) {
        return paymentMapper.createPayment(payment);
    }
}
