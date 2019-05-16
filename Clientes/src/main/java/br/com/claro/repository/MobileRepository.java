package br.com.claro.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import br.com.claro.model.Mobile;

/**
 * Access mobile info on db
 * @author Bruno Diorio
 */
@Component
public interface MobileRepository extends GenericRepository<Mobile>{

	
	@Query("SELECT m FROM Mobile m WHERE m.code = :code")
	public Mobile findByCode(@Param("code") String code );
}
