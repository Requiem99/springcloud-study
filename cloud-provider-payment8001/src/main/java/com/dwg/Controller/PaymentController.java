package com.dwg.Controller;

import com.dwg.CommonResult.CommonResult;
import com.dwg.Entities.Payment;
import com.dwg.Service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    public PaymentService paymentService;


    @GetMapping("/getPaymentList")
    public CommonResult getPaymentList(){
        List paymentList = paymentService.getPaymentList();
        return new CommonResult<List>(200,"OK",paymentList);
    }

    @GetMapping("/test")
    public String test(Long id){
        log.info("请求体：{}",id);
        return "hello!";
    }

    @GetMapping("/findPaymentById/{id}")
    public CommonResult findPaymentById(@PathVariable("id") Long id){
        Payment paymentById = paymentService.findPaymentById(id);
        return  paymentById == null ?
                    new CommonResult(500,"Fail") :
                    new CommonResult(200,"OK",paymentById);
    }

    @PostMapping("/createPayment")
    public CommonResult createPayment(Payment payment){
        CommonResult commonResult =null;
        log.info("xx:{}",payment);
        Long paymentId = paymentService.createPayment(payment);
        if (paymentId > 0){
           commonResult = new CommonResult(200,"insert OK ! " ,paymentId);
        }else {
            commonResult = new CommonResult(200,"insert Fail ! " );
        }
        return commonResult;
    };
}
