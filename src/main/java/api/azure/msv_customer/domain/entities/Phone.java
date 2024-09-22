package api.azure.msv_customer.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "phone")

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String countryCode;
}
