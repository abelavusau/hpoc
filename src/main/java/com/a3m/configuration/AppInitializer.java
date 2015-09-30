package com.a3m.configuration;

import com.a3m.filter.SimpleCORSFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

    @Override
    protected Filter[] getServletFilters() {

        SimpleCORSFilter simpleCORSFilter = new SimpleCORSFilter();
      ///  simpleCORSFilter.setEncoding("UTF-8");
        return new Filter[] { simpleCORSFilter};
    }
}
