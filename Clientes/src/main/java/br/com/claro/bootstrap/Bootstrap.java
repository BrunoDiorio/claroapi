package br.com.claro.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.com.claro.model.Mobile;
import br.com.claro.repository.MobileRepository;

/**
 * Inicia valores na base
 * @author Bruno Diorio
 */
@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private MobileRepository mobileRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		init();
	}

	private void init() {
		Mobile vo1 = new Mobile("Moto G5 Plus",  "653d9688-af26-4ff1-b1a6-58c474fba27f", 1990, "Motorola", "http://www3.claro.com.br/sites/default/files/claro-net-simples_5654b06692637-224x170_565c9453ee1bf.png", "26/11/2015");
		Mobile vo2 = new Mobile("IPhone 7 Plus", "d10e528f-9f2c-4271-9dc1-967bef224695", 3990, "Apple",    "http://www3.claro.com.br/sites/default/files/claro-net-simples_5654b06692637-224x170_565c9453ee1bf.png", "25/12/2015");
		Mobile vo3 = new Mobile("J7", 			 "ba59f136-9d1f-42bf-8f4a-826dca8dde5b",  699, "Samsung",  "http://www3.claro.com.br/sites/default/files/claro-net-simples_5654b06692637-224x170_565c9453ee1bf.png", "01/11/2015");
		
		mobileRepository.save(vo1);
		mobileRepository.save(vo2);
		mobileRepository.save(vo3);
	}

}
