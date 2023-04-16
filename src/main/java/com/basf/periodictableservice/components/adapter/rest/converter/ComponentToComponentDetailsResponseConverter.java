package com.basf.periodictableservice.components.adapter.rest.converter;

import com.basf.periodictableservice.components.Component;
import com.basf.periodictableservice.components.adapter.rest.dto.ComponentDetailsResponse;

import org.springframework.core.convert.converter.Converter;

public class ComponentToComponentDetailsResponseConverter implements Converter<Component, ComponentDetailsResponse>{

    @Override
    public ComponentDetailsResponse convert(Component source) {
        return new ComponentDetailsResponse.Builder()
            .withAtomicNumber(source.getAtomicNumber())
            .withSymbol(source.getSymbol())
            .withName(source.getName())
            .build();
    }
    
}
