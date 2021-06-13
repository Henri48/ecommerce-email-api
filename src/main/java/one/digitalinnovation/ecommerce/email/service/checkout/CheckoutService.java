package one.digitalinnovation.ecommerce.email.service.checkout;

import javax.mail.*;

public interface CheckoutService {

    void sendEmail(String checkoutCode) throws MessagingException;
}
