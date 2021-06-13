package one.digitalinnovation.ecommerce.email.listener;

import one.digitalinnovation.ecommerce.email.event.*;
import one.digitalinnovation.ecommerce.email.service.checkout.*;
import one.digitalinnovation.ecommerce.email.streaming.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import javax.mail.*;

@Component
@RequiredArgsConstructor
@Slf4j
public class CheckoutCreatedListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) throws MessagingException {
        log.info("22 - checkoutCreatedEvent={}", paymentCreatedEvent);
        checkoutService.sendEmail(paymentCreatedEvent.getCheckoutCode().toString());
    }
}
