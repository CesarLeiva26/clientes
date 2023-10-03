package edu.pe.cibertec.clientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "producto")
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codproducto;

    @Column(name = "nomproducto")
    private String nomproducto;

    @Column(name = "preproducto")
    private Double preproducto;

    @Column(name = "canproducto")
    private Integer canproducto;

    public Double getGanancias() {
        return preproducto * canproducto;
    }

    public Double getDescuento() {
        if (canproducto <= 10) {
            return preproducto * 0.2;
        } else if (canproducto >= 11 && canproducto <= 20) {
            return preproducto * 0.4;
        } else if (canproducto >= 21) {
            return preproducto * 0.6;
        } else {
            return 0.0;
        }
    }


        public String getGananciadescuento () {
            double gananciaConDecimales = getDescuento() * canproducto;
            int gananciaEntera = (int) Math.round(gananciaConDecimales);
            String resultado = "Ahora estas ganando: " + gananciaEntera + " soles";
            return resultado;
        }
    }