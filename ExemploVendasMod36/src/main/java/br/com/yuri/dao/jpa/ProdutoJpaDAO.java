package br.com.yuri.dao.jpa;

import br.com.yuri.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.yuri.domain.jpa.ProdutoJpa;

/**
 * @author yuri
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
