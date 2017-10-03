package com.projetoWeb.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Pede um array de classes de configurações
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}

	/**
	 * Pede um array com os mapeamentos que queremos que nosso servlet atenda.
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

	
}
