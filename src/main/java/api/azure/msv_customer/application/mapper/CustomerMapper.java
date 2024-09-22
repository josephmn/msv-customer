package api.azure.msv_customer.application.mapper;

import api.azure.msv_customer.application.dto.CustomerDTO;
import api.azure.msv_customer.domain.entities.Customer;

import java.util.stream.Collectors;

public class CustomerMapper {
    public static Customer toEntity(CustomerDTO dto) {
        if (dto == null) {
            return null;
        }
        return Customer.builder()
                .id(dto.getId())
                .name(dto.getName())
                .lastName(dto.getLastName())
                .documentType(dto.getDocumentType())
                .documentNumber(dto.getDocumentNumber())
                .address(dto.getAddress())
                .phones(dto.getPhones().stream().map(PhoneMapper::toEntity).collect(Collectors.toList()))
                .build();
    }

    public static CustomerDTO toDTO(Customer entity) {
        if (entity == null) {
            return null;
        }
        return CustomerDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .lastName(entity.getLastName())
                .documentType(entity.getDocumentType())
                .documentNumber(entity.getDocumentNumber())
                .address(entity.getAddress())
                .phones(entity.getPhones().stream().map(PhoneMapper::toDTO).collect(Collectors.toList()))
                .build();
    }
}
