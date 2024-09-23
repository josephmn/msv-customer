package api.azure.msv_customer.application.implementation;

import api.azure.msv_customer.application.dto.CustomerDTO;
import api.azure.msv_customer.application.mapper.CustomerMapper;
import api.azure.msv_customer.application.mapper.PhoneMapper;
import api.azure.msv_customer.domain.entities.Customer;
import api.azure.msv_customer.domain.repositories.CustomerRepository;
import api.azure.msv_customer.domain.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

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
        return customerRepository.findById(id)
                .map(CustomerMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        // Customer customer = CustomerMapper.toEntity(customerDTO);
        // Customer savedCustomer = customerRepository.save(customer);
        // return CustomerMapper.toDTO(savedCustomer);

        return Optional.ofNullable(customerDTO)
                .map(CustomerMapper::toEntity)          // 1. Convertir DTO a entidad
                .map(customerRepository::save)          // 2. Guardar la entidad en la base de datos
                .map(CustomerMapper::toDTO)             // 3. Convertir la entidad guardada a DTO
                .orElseThrow(() -> new RuntimeException("Error creating customer")); // 4. Manejo de errores
    }

    @Override
    public CustomerDTO updateCustomer(UUID id, CustomerDTO customerDTO) {
        return customerRepository.findById(id)    // 1. Buscar el cliente por ID
                .map(existingCustomer -> {        // 2. Mapear las actualizaciones
                    existingCustomer.setName(customerDTO.getName());
                    existingCustomer.setLastName(customerDTO.getLastName());
                    existingCustomer.setDocumentType(customerDTO.getDocumentType());
                    existingCustomer.setDocumentNumber(customerDTO.getDocumentNumber());
                    existingCustomer.setEmail(customerDTO.getEmail());
                    existingCustomer.setAddress(customerDTO.getAddress());

                    // Si también necesitas actualizar la lista de teléfonos
                    /*
                    existingCustomer.setPhones(
                            customerDTO.getPhones().stream()
                                    .map(PhoneMapper::toEntity)
                                    .collect(Collectors.toList())
                    */
                    existingCustomer.getPhones().clear();
                    existingCustomer.getPhones().addAll(customerDTO.getPhones().stream()
                            .map(PhoneMapper::toEntity)
                            .toList()
                    );
                    return existingCustomer;
                })
                .map(customerRepository::save)    // 3. Guardar la entidad actualizada
                .map(CustomerMapper::toDTO)       // 4. Convertir a DTO y devolver
                .orElseThrow(() -> new RuntimeException("Customer not found")); // 5. Manejo de errores si no se encuentra
    }

    @Override
    public void deleteCustomer(UUID id) {
        customerRepository.deleteById(id);
    }
}
