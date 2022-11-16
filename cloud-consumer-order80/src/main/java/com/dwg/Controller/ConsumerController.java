package com.dwg.Controller;

import com.dwg.CommonResult.CommonResult;
import com.dwg.Entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


@RestController
public class ConsumerController {

    static final String URL_PREFIX = "http://localhost:8081";

    @Resource
    RestTemplate restTemplate;

    @GetMapping("/consumer/createPayment")
    public CommonResult createPayment(Payment payment){
        CommonResult commonResult =
                restTemplate.postForObject(URL_PREFIX + "/payment/createPayment", payment, CommonResult.class);
        return commonResult;
    }


    @GetMapping("/consumer/findPaymentById/{id}")
    public CommonResult findPaymentById(@PathVariable("id") Long id){
        CommonResult commonResult =
                restTemplate.getForObject(URL_PREFIX + "/payment/findPaymentById/" + id, CommonResult.class);
        return commonResult;
    }

}
