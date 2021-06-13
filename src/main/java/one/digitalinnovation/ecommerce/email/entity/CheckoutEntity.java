package one.digitalinnovation.ecommerce.email.entity;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.jpa.domain.support.*;

import javax.persistence.Id;
import javax.persistence.*;
import java.time.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    private String email;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column
    private Boolean saveAddress;

    @Column
    private Boolean saveInformation;

    @Column
    @CreatedDate
    private LocalDateTime createdAt;

    @Column
    @LastModifiedDate
    private LocalDateTime updatedAt;

    public enum Status {
        CREATED,
        APPROVED
    }
}
