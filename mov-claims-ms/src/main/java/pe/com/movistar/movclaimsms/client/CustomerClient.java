package pe.com.movistar.movclaimsms.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.movistar.movclaimsms.model.Customer;

@FeignClient(name="mov-claims-ms-customer", url="http://localhost:8092")
@RequestMapping(value ="/customers")
public interface CustomerClient {

    @GetMapping(value ="/{customerCode}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("customerCode") Long customerCode);

}
