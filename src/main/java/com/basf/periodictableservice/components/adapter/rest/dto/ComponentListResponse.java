package com.basf.periodictableservice.components.adapter.rest.dto;

import java.util.Arrays;

public class ComponentListResponse {

    private ComponentDetailsResponse[] components;

    public ComponentDetailsResponse[] getComponents() {
        return Arrays.stream(components).toArray(ComponentDetailsResponse[]::new);
    }

    public static class Builder {

        private final ComponentListResponse object;

        public Builder() {
            object = new ComponentListResponse();
        }

        public ComponentListResponse.Builder withComponents(ComponentDetailsResponse[] value) {
            object.components = value;
            return this;
        }

        public ComponentListResponse build() {
            return object;
        }
    }
    
}
