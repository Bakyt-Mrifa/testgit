package kg.megacom.services;

import kg.megacom.models.entity.Customer;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    Customer findCustomerById(Long id);

}
