package com.basf.periodictableservice.components;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class ComponentService {

    private HashMap<String,Component> mockComponents = new HashMap<>();

    public ComponentService(){
        mockComponents.put("H", new Component.Builder().withAtomicNumber(1).withSymbol("H").withName("Hydrogen").build());
        mockComponents.put("He", new Component.Builder().withAtomicNumber(2).withSymbol("He").withName("Helium").build());
        mockComponents.put("Li", new Component.Builder().withAtomicNumber(3).withSymbol("Li").withName("Lithium").build());
    }

    public Component getComponent(String symbol) {
        Component component = mockComponents.get(symbol);
        if (component != null) {
            return component;
        }else{
            throw new ComponentNotFoundException();
        }

    }
    
}
