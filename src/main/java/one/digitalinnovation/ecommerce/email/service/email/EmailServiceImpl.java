package one.digitalinnovation.ecommerce.email.service.email;

import lombok.*;
import lombok.extern.slf4j.*;
import one.digitalinnovation.ecommerce.email.entity.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.*;
import org.springframework.mail.javamail.*;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;

@Service
public class EmailServiceImpl implements EmailService{

    @Value("${spring.mail.username}")
    private String from;

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public void sendEmail(CheckoutEntity entity) throws MessagingException {
        sendSimpleMessage(
                entity.getEmail()
                , "Pagemento"
                , String.format("Seu pagamento da compra %s foi recebido!", entity.getCode()));
    }



    public void sendSimpleMessage(
            String to, String subject, String text) throws MessagingException {
        System.out.println(String.format("\n\n Enviando email de %s para %s \n\n", from, to));
        MimeMessage message = emailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, "utf-8");
        helper.setFrom(from);
        helper.setTo(to);
        helper.setText(text, true);
        helper.setSubject(subject);
        emailSender.send(message);

    }
}
