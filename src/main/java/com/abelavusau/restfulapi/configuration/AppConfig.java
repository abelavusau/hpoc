package com.abelavusau.restfulapi.configuration;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.abelavusau.restfulapi" })
@Import(value = { DbConfig.class })
public class AppConfig {
	private static final MediaType APPLICATION_JSON = new MediaType("application", "json", StandardCharsets.UTF_8);

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		List<MediaType> supportedMediaTypes = new ArrayList<MediaType>(1);
		supportedMediaTypes.add(APPLICATION_JSON);

		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		return converter;
	}
}
