/*
 * package com.learning.employe.config;
 * 
 * import java.util.List;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.http.converter.HttpMessageConverter; import
 * org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
 * import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
 * 
 * import com.fasterxml.jackson.databind.ObjectMapper; import
 * com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
 * 
 * @Configuration public class AppWebMvcConfigurer implements WebMvcConfigurer {
 * 
 * @Override public void extendMessageConverters(List<HttpMessageConverter<?>>
 * converters) { for (HttpMessageConverter<?> converter : converters) { if
 * (converter instanceof
 * org.springframework.http.converter.json.MappingJackson2HttpMessageConverter)
 * { ObjectMapper mapper = ((MappingJackson2HttpMessageConverter)
 * converter).getObjectMapper(); mapper.registerModule(new Hibernate5Module());
 * } } }
 * 
 * }
 */