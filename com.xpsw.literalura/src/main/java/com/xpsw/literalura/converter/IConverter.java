package com.xpsw.literalura.converter;

public interface IConverter {
    <T> T obtenerDatos(String json, Class<T> clase);
}