package api.azure.msv_customer.application.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {
    private Long id;
    private String number;
    private String countryCode;
}
