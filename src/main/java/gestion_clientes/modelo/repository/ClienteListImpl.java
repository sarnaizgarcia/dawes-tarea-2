package gestion_clientes.modelo.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import gestion_clientes.modelo.beans.Cliente;

public class ClienteListImpl implements IntCliente {
	
	private List<Cliente> listaClientes;
	
	public ClienteListImpl() {
		listaClientes = new ArrayList<Cliente>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		listaClientes.add(new Cliente("presi", "PSOE", "pedro@mail.com", "Pedro Sánchez", "Ferraz, 70", new Date()));
		listaClientes.add(new Cliente("pablo", "PP", "pablo@mail.com", "Pablo Casado", "Génova, 13", new Date()));
	}

	@Override
	public Cliente findById(int idCliente) {
		Cliente cliente = listaClientes.stream()
				.filter(ele -> idCliente == ele.getIdUsuario())
				.findAny()
				.orElse(null);
		return cliente;
	}

	@Override
	public List<Cliente> findAll() {
		return listaClientes;
	}

	@Override
	public int insertarCliente(Cliente cliente) {
		if (listaClientes.contains(cliente))
			return 0;
		else
			return listaClientes.add(cliente) ? 1 : 0;
	}

	@Override
	public int modificarCliente(Cliente cliente) {
		int pos = listaClientes.indexOf(cliente);
		if (pos == -1)
			return 0;
		else
			return (listaClientes.set(pos, cliente) != null) ? 1 : 0;
	}

	@Override
	public int eliminarCliente(Cliente cliente) {
		return listaClientes.remove(cliente) ? 1 : 0;
	}

	@Override
	public int eliminarCliente(int idCliente) {
		Cliente aux = new Cliente();
		aux.setIdUsuario(idCliente);		
		int pos = listaClientes.indexOf(aux);
		if (pos == -1)
			return 0;
		else
			return (listaClientes.remove(pos) !=null) ? 1 : 0;
	}

}
