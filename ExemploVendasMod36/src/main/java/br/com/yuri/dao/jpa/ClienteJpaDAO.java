package br.com.yuri.dao.jpa;

import br.com.yuri.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.yuri.domain.jpa.ClienteJpa;

/**
 * @author yuri
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
