package br.com.claro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Mobile VO class
 * @author Bruno Diorio
 */
@Getter @Setter 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Component
@Scope(value=BeanDefinition.SCOPE_PROTOTYPE)
public class Mobile extends GenericModel implements Serializable{
	
	private static final long serialVersionUID = -8671539270457887826L;

	private String model;
	@Column(unique=true)
	private String code;
	private int    price;
	private String brand;
	private String photo;
	private String date;
}