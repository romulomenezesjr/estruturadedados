package ifpb.pi.edd.listaestatica.teste;

import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteVerificar {

	public static void main(String[] args) {
		ListaEstatica lista = new ListaEstatica();
		lista.inicializa();
		lista.adicionar("Rômulo");
		lista.adicionar("José");
		lista.adicionar("Thiago");
		System.out.println(lista.verificar("Rômulo"));
	}
}
