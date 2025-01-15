package br.com.yuri.dao.jpa;

import br.com.yuri.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.yuri.domain.jpa.ClienteJpa2;

/**
 * @author yuri
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
