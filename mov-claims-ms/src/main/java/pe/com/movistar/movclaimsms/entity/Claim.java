package pe.com.movistar.movclaimsms.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pe.com.movistar.movclaimsms.model.Customer;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="tbl_claims")
public class Claim implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long claimCode;

    private Long customerCode;
    private String claimReason;
    private String claimDescription;

    @Transient
    private Customer customer;


}
