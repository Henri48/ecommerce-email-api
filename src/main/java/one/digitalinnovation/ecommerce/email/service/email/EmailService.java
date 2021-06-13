package one.digitalinnovation.ecommerce.email.service.email;

import one.digitalinnovation.ecommerce.email.entity.*;

import javax.mail.*;

public interface EmailService {

    void sendEmail(CheckoutEntity entity) throws MessagingException;

    void sendSimpleMessage(String to, String subject, String text) throws MessagingException;
}
