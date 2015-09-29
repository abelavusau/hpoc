package com.a3m.configuration;

import java.util.HashSet;
import java.util.Set;

import com.a3m.service.converter.SmalLeadDoToSmalLeadModelConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.a3m.controller.converter.LeadStatisticsModelToLeadStatisticsVOConverter;
import com.a3m.service.converter.LeadStatisticsDoToLeadStatisticsModelConverter;
import com.a3m.service.converter.SalesDOToSalesModelConverter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.a3m" })
@Import(value = { DbConfig.class })
public class AppConfig {

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		return converter;
	}

	@Bean
	public ConversionService conversionService() {
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		bean.setConverters(getConverters());
		bean.afterPropertiesSet();
		ConversionService object = bean.getObject();
		return object;
	}

	private Set<Converter> getConverters() {
		Set<Converter> converters = new HashSet<Converter>();

		converters.add(new LeadStatisticsDoToLeadStatisticsModelConverter());
		converters.add(new LeadStatisticsModelToLeadStatisticsVOConverter());
		converters.add(new SalesDOToSalesModelConverter());
		converters.add(new SmalLeadDoToSmalLeadModelConverter());
		return converters;
	}
}
