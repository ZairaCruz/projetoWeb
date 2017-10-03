package com.projetoWeb.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.projetoWeb.controller.HomeController;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class})
public class AppWebConfiguration {

	/**
	 * Retorna um objeto que ajuda o SpringMVC a encontrar as views. 
	 * O setPrefix define o caminho onde estão nossas views, já o setSuffix adiciona a extenção dos arquivos de view
	 * @return um objeto do tipo InternalResourceViewResolver (Resolvedor Interno de Recursos de View)
	 */
	@Bean
	public InternalResourceViewResolver internalResouceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
