package br.com.claro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.claro.model.Mobile;
import br.com.claro.repository.MobileRepository;
import br.com.claro.service.exceptions.MobileNotFoundException;

@Service
public class MobileService {

	@Autowired
	private MobileRepository mobileRepository;
	
	public List<Mobile> getAll(){
		return mobileRepository.findAll();
	}
	
	public Mobile findByCode( String code){
		Mobile m = mobileRepository.findByCode( code );
		
		if( m == null) {
			throw new MobileNotFoundException( "Mobile not found" );
		}
		
		return mobileRepository.findByCode( code );
	}
	
	public Mobile save(Mobile entity) {
		return mobileRepository.save(entity);
	}
}
