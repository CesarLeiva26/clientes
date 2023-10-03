package edu.pe.cibertec.clientes.controller;

import edu.pe.cibertec.clientes.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    @GetMapping("")
    public String frmCliente(Model model) {
        model.addAttribute("listarCliente", clienteService.listarClientes());
        return "frmCliente";
    }
}
