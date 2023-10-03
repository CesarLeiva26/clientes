package edu.pe.cibertec.clientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "cliente")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codcliente;

    @Column(name = "dni")
    private Integer dni;

    @Column(name = "nomcliente")
    private String nomcliente;

    @Column(name = "apecliente")
    private String apecliente;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "numtelefono")
    private String numtelefono;

}
