package br.com.yuri.dao.generic.jpa;

import br.com.yuri.domain.jpa.Persistente;

import java.io.Serializable;

/**
 * @author yuri
 *
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
