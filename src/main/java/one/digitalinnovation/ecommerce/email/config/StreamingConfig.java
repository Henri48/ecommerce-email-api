package one.digitalinnovation.ecommerce.email.config;

import one.digitalinnovation.ecommerce.email.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(PaymentPaidSink.class)
public class StreamingConfig {
}
