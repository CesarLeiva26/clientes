package edu.pe.cibertec.clientes.service;

import edu.pe.cibertec.clientes.model.Cliente;
import edu.pe.cibertec.clientes.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {

    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes(){
        return clienteRepository.findAll();
    }
}
