package ifpb.pi.edd.listaestatica.teste;

import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteRecuperar {

	public static void main(String[] args) {
		ListaEstatica lista = new ListaEstatica();
		lista.inicializa();
		lista.adicionar("R�mulo");
		lista.adicionar("Jos�");
		lista.adicionar("Thiago");
		System.out.println(lista.recuperar(3));
	}
}
