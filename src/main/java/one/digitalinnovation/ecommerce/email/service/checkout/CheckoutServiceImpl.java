package one.digitalinnovation.ecommerce.email.service.checkout;

import lombok.*;
import lombok.extern.slf4j.*;
import one.digitalinnovation.ecommerce.email.repository.*;
import one.digitalinnovation.ecommerce.email.service.checkout.*;
import one.digitalinnovation.ecommerce.email.service.email.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.stereotype.Service;

import javax.mail.*;


@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private EmailService emailService;

    @Autowired
    private CheckoutRepository checkoutRepository;

    @Override
    public void sendEmail(String checkoutCode) throws MessagingException {
        checkoutRepository.findByCode(checkoutCode)
                .ifPresent(entity -> {
                    try {
                        emailService.sendEmail(entity);
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }
                });
    }
}
