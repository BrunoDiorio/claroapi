package br.com.claro.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Abstract Vo class
 * @author Bruno Diorio
 */
@Getter @Setter 
@ToString
@Component
@MappedSuperclass
public abstract class GenericModel implements Serializable{
	
	private static final long serialVersionUID = -6007605986768851593L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonIgnore
	private Long id;

}
