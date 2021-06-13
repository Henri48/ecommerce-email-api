package one.digitalinnovation.ecommerce.email.streaming;

import org.springframework.cloud.stream.annotation.*;
import org.springframework.messaging.*;

public interface PaymentPaidSink {

    String INPUT = "payment-paid-input";

    @Input(INPUT)
    SubscribableChannel input();
}
