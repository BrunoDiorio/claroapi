package br.com.claro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.claro.model.GenericModel;

/**
 * Generic DAO
 * @author Bruno Diorio
 *
 * @param <T>
 */
public interface GenericRepository<T extends GenericModel> extends JpaRepository<T, Long>{

}
