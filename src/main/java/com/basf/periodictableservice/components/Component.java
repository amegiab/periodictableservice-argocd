package com.basf.periodictableservice.components;

public class Component {

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

        private final Component object;

        public Builder() {
            object = new Component();
        }

        public Component.Builder withSymbol(String value) {
            object.symbol = value;
            return this;
        }

        public Component.Builder withName(String value) {
            object.name = value;
            return this;
        }

        public Component.Builder withAtomicNumber(int value) {
            object.atomicNumber = value;
            return this;
        }

        public Component build() {
            return object;
        }
    }
    
}
