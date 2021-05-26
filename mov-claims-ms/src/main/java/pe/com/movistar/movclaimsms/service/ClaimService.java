package pe.com.movistar.movclaimsms.service;

import pe.com.movistar.movclaimsms.entity.Claim;

public interface ClaimService {

    public Claim getClaim(Long claimCode);
    public Claim createClaim(Claim claim);
}
