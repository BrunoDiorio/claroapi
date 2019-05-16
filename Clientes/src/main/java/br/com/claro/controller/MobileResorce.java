package br.com.claro.controller;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.claro.model.Mobile;
import br.com.claro.service.MobileService;

@RestController
@RequestMapping("/claro/mobile")
public class MobileResorce {

	@Autowired
	private MobileService mobileService;
	
	@CrossOrigin
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Mobile>> getAll(){
		CacheControl cc = CacheControl.maxAge(30, TimeUnit.SECONDS);
		return ResponseEntity.status( HttpStatus.OK ).cacheControl(cc).body(mobileService.getAll());
	}
	
	@CrossOrigin
	@RequestMapping(value="/{code}", method=RequestMethod.GET)
	public ResponseEntity<Mobile> findByCode( @PathVariable("code") String code ) {
		CacheControl cc = CacheControl.maxAge(30, TimeUnit.SECONDS);
		return ResponseEntity.status( HttpStatus.OK ).cacheControl(cc).body(mobileService.findByCode( code ));
	}

	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Mobile> save( @RequestBody Mobile mobile ) {
		CacheControl cc = CacheControl.maxAge(30, TimeUnit.SECONDS);
		return ResponseEntity.status( HttpStatus.OK ).cacheControl(cc).body(mobileService.save( mobile ));
	}
}