package com.abelavusau.restfulapi.configuration;

import java.util.HashSet;
import java.util.Set;

import com.abelavusau.restfulapi.controller.converter.LeadStatisticsModelToLeadStatisticsVOConverter;
import com.abelavusau.restfulapi.service.converter.LeadStatisticsDoToLeadStatisticsModelConverter;
import com.abelavusau.restfulapi.service.converter.SalesDOToSalesModelConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.abelavusau.restfulapi" })
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

		return converters;
	}
}
