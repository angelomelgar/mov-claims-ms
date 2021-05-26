package pe.com.movistar.movclaimsms.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.movistar.movclaimsms.client.CustomerClient;
import pe.com.movistar.movclaimsms.entity.Claim;
import pe.com.movistar.movclaimsms.model.Customer;
import pe.com.movistar.movclaimsms.service.ClaimService;

@Service
@RequiredArgsConstructor
public class ClaimServiceImpl implements ClaimService {


    @Autowired
    private ClaimRepository claimRepository;

    @Autowired
    private CustomerClient customerClient;


    @Override
    public Claim getClaim(Long claimCode) {
        Claim claim = claimRepository.findByClaimCode(claimCode);
        Customer customer = customerClient.getCustomer(claim.getCustomerCode()).getBody();
        claim.setCustomer(customer);
        return claim;
    }

    @Override
    public Claim createClaim(Claim claim) {
        return claimRepository.save(claim);
    }
}
