

package com.TP.Elisa.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
       
    @NotNull
    @Size (min = 2, max = 50, message = "debe completar este campo")
    private String nombre;
    
    @NotNull
    @Size (min = 2, max = 50, message = "debe completar este campo")
    private String apellido;
    
    @Size (min = 2, max = 50, message = "debe completar este campo")
    private String img;
    
}
