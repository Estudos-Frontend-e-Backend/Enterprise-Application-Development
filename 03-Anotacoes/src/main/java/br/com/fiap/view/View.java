package br.com.fiap.view;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotation.Coluna;
import br.com.fiap.model.Pessoa;

public class View {

	public static void main(String[] args) {

		// Instanciar uma pessoa
		Pessoa pessoa = new Pessoa();

		// Recuperar o nome da classe através da API de Reflection
		String nomeClasse = pessoa.getClass().getName();
		System.out.println(nomeClasse);

		// Recuperar os métodos da classe através da API de Reflection
		Method[] metodos = pessoa.getClass().getDeclaredMethods();

		// Exibir o nome dos métodos
		for (Method m : metodos) {
			System.out.println(m.getName());
		}

		// Recuperar os atributos da classe
		Field[] atributos = pessoa.getClass().getDeclaredFields();
		// Exibir o nome e o tipo dos atributos
		for (Field f : atributos) {
			System.out.println(f.getName() + " " + f.getType());

			// Para recuperar a anotação da @Coluna

			Coluna anotacao = f.getAnnotation(Coluna.class);

			// Exbir os parametros da anotação
			System.out.println(anotacao.nome() + " " + anotacao.tamanho() + " " + anotacao.obrigatorio());
		}

	}
}