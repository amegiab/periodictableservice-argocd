package com.basf.periodictableservice.components.adapter.rest;

import com.basf.periodictableservice.components.ComponentService;
import com.basf.periodictableservice.components.adapter.rest.dto.ComponentDetailsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
public class ComponentsController {

    private final ComponentService componentService;
    private final ConversionService conversionService;

    @Autowired
    public ComponentsController(ComponentService componentService,
            ConversionService conversionService) {
        this.componentService = componentService;
        this.conversionService = conversionService;
    }

    @GetMapping(value = "/v1/components/{symbol}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ComponentDetailsResponse> getComponent(@PathVariable("symbol") String symbol) {
        return new ResponseEntity<ComponentDetailsResponse>(conversionService.convert(componentService.getComponent(symbol), ComponentDetailsResponse.class), HttpStatus.OK);
    }

    @GetMapping(value = "/v1/components", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ComponentDetailsResponse>> getComponents() {
        List<ComponentDetailsResponse> components = componentService.getComponents()
                .stream()
                .map(component -> conversionService.convert(component, ComponentDetailsResponse.class))
                .collect(Collectors.toList());
        return new ResponseEntity<List<ComponentDetailsResponse>>(components, HttpStatus.OK);
    }

}