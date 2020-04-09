package kg.megacom.services.impl;

import kg.megacom.models.entity.Customer;
import kg.megacom.repository.CustomerRepository;
import kg.megacom.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(Long id) {
        Customer customer=customerRepository.findById(id).orElse(new Customer());
        return customer;
    }
}
