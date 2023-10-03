package edu.pe.cibertec.clientes.service;

import edu.pe.cibertec.clientes.model.Producto;
import edu.pe.cibertec.clientes.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductoService {

    private ProductoRepository productoRepository;

    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }
}
