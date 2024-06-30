package com.valdir.payment_service.service;

import com.valdir.payment_service.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
