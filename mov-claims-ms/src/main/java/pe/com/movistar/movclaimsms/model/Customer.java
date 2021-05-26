package pe.com.movistar.movclaimsms.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Transient;

@Data
@Builder
public class Customer {
    private Long customerCode;
    private Long productCode;
    private String documentType;
    private String documentNumber;
    private String birthDate;
}
