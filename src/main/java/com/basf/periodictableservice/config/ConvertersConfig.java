package com.basf.periodictableservice.config;

import com.basf.periodictableservice.components.adapter.rest.converter.ComponentToComponentDetailsResponseConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConvertersConfig  implements WebMvcConfigurer{

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new ComponentToComponentDetailsResponseConverter());
    }

    
    
}
