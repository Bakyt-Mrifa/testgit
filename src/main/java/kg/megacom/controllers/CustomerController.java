package kg.megacom.controllers;

import io.swagger.annotations.Api;
import kg.megacom.models.entity.Customer;
import kg.megacom.models.entity.Lot;
import kg.megacom.services.CustomerService;
import kg.megacom.services.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customer")
@Api(value = "Customer Management", description = "Методы для управления участниками")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping(value = "/save")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
    @GetMapping("/get/{id}")
    public Customer getLotById(@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

}
