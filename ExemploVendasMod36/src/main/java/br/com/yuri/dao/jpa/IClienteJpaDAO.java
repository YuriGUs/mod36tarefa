package br.com.yuri.dao.jpa;

import br.com.yuri.dao.generic.jpa.IGenericJapDAO;
import br.com.yuri.domain.jpa.Persistente;

/**
 * @author yuri
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
