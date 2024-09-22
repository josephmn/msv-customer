package api.azure.msv_customer.application.implementation;

import api.azure.msv_customer.application.dto.CustomerDTO;
import api.azure.msv_customer.application.mapper.CustomerMapper;
import api.azure.msv_customer.domain.entities.Customer;
import api.azure.msv_customer.domain.repositories.CustomerRepository;
import api.azure.msv_customer.domain.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(CustomerMapper::toDTO)
                .toList();
    }

    @Override
    public CustomerDTO getCustomerById(UUID id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(CustomerMapper::toDTO).orElse(new CustomerDTO());
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public CustomerDTO updateCustomer(UUID id, CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomer(UUID id) {

    }
}
