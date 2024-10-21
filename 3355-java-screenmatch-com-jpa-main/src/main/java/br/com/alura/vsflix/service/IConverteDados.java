package br.com.alura.vsflix.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
