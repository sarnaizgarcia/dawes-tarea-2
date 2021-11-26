package gestion_clientes.modelo.repository;

import java.util.List;

import gestion_clientes.modelo.beans.Cliente;

public interface IntCliente {
	
	Cliente findById(int idCliente);
	List<Cliente> findAll();
	int insertarCliente(Cliente cliente);
	int modificarCliente(Cliente cliente);
	int eliminarCliente(Cliente cliente);
	int eliminarCliente(int idCliente);
}