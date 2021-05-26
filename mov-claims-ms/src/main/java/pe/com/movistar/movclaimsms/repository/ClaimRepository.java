package pe.com.movistar.movclaimsms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.movistar.movclaimsms.entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

    public Claim findByClaimCode(Long claimCode);
}
