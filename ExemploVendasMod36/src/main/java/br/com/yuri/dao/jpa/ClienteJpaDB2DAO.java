package br.com.yuri.dao.jpa;

import br.com.yuri.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.yuri.domain.jpa.ClienteJpa;

/**
 * @author yuri
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
