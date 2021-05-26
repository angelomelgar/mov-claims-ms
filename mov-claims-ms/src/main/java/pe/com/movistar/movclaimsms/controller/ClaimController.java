package pe.com.movistar.movclaimsms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.com.movistar.movclaimsms.entity.Claim;
import pe.com.movistar.movclaimsms.service.ClaimService;

@Slf4j
@RestController
@RequestMapping(value ="/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    @PostMapping
    public ResponseEntity<Claim> createClaim(@RequestBody Claim claim){
        Claim claimCreate = claimService.createClaim(claim);
        log.info("Reclamo creado");
        return ResponseEntity.status(HttpStatus.CREATED).body(claimCreate);
    }


    @GetMapping(value ="/{claimCode}")
    public ResponseEntity<Claim> getClaim(@PathVariable("claimCode") Long claimCode){
        Claim claim = claimService.getClaim(claimCode);
        if(null==claim){
            log.error("Reclamo no encontrado");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(claim);
    }




}
