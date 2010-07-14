package org.rojo.repository.converters;

import org.rojo.repository.TypeConverter;

public class StringConverter implements TypeConverter {

    @SuppressWarnings("rawtypes")
    @Override
    public boolean applyesFor(Class type) {
        return type == String.class;
    }

    @Override
    public byte[] encode(Object object) {
        return ((String)object).getBytes();
    }

    @Override
    public Object decode(byte[] bytes) {
        return new String(bytes);
    }
    
}