package api.azure.msv_customer.application.mapper;

import api.azure.msv_customer.application.dto.PhoneDTO;
import api.azure.msv_customer.domain.entities.Phone;

public class PhoneMapper {
    public static Phone toEntity(PhoneDTO dto) {
        if (dto == null) {
            return null;
        }
        return Phone.builder()
                .id(dto.getId())
                .number(dto.getNumber())
                .countryCode(dto.getCountryCode())
                .build();
    }

    public static PhoneDTO toDTO(Phone entity) {
        if (entity == null) {
            return null;
        }
        return PhoneDTO.builder()
                .id(entity.getId())
                .number(entity.getNumber())
                .countryCode(entity.getCountryCode())
                .build();
    }
}
