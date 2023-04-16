package com.basf.periodictableservice.components.adapter.rest.dto;

public class ComponentDetailsResponse {

    private int atomicNumber;
    private String symbol;
    private String name;

    public int getAtomicNumber() {
        return atomicNumber;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public String getName() {
        return name;
    }
    
    public static class Builder {

        private final ComponentDetailsResponse object;

        public Builder() {
            object = new ComponentDetailsResponse();
        }

        public ComponentDetailsResponse.Builder withSymbol(String value) {
            object.symbol = value;
            return this;
        }

        public ComponentDetailsResponse.Builder withName(String value) {
            object.name = value;
            return this;
        }

        public ComponentDetailsResponse.Builder withAtomicNumber(int value) {
            object.atomicNumber = value;
            return this;
        }

        public ComponentDetailsResponse build() {
            return object;
        }
    }

    
}
