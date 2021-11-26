package gestion_clientes.modelo.repository;

import java.util.Date;
import java.util.List;

import gestion_clientes.modelo.beans.Cliente;

public class ClienteImpl implements IntCliente {
	
	private List<Cliente> listaClientes;
	
	Cliente cliente1 = new Cliente(1, "Harry", "1234", "harry@mail.com", "Harry James Potter", "Gryffindor", 0, new Date());
	Cliente cliente2 = new Cliente(1, "Hermione", "abcde", "hermione@mail.com", "Hermione Jean Granger", "Gryffindor", 0, new Date());
	Cliente cliente3 = new Cliente(1, "Rubeus", "ABCDE", "rubeus@mail.com", "Rubeus Hagrid", "Gryffindor", 0, new Date());
	Cliente cliente4 = new Cliente(1, "Luna", "Hola", "luna@mail.com", "Luna Lovegood", "Ravenclaw", 0, new Date());
	
	private void cargarDatos() {
		listaClientes.add(cliente1);
		listaClientes.add(cliente2);
		listaClientes.add(cliente3);
		listaClientes.add(cliente4);
	}
}
