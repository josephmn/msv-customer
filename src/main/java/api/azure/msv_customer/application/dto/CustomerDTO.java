package api.azure.msv_customer.application.dto;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private UUID id;
    private String name;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String email;
    private String address;
    private List<PhoneDTO> phones;
}
