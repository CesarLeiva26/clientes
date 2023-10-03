package edu.pe.cibertec.clientes.controller;

import edu.pe.cibertec.clientes.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoController {

    private ProductoService productoService;

    @GetMapping("")
    public String frmProducto(Model model){
        model.addAttribute("listarProducto", productoService.listarProductos());
        return "frmProducto";
    }
}
