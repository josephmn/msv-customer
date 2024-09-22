package api.azure.msv_customer.domain.services;

import api.azure.msv_customer.application.dto.CustomerDTO;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomerById(UUID id);
    CustomerDTO createCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(UUID id, CustomerDTO customerDTO);
    void deleteCustomer(UUID id);
}
