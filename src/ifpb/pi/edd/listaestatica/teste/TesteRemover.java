package ifpb.pi.edd.listaestatica.teste;

import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteRemover {

	public static void main(String[] args) {
		ListaEstatica lista = new ListaEstatica();
		lista.inicializa();
		lista.adicionar("Rômulo");
		lista.adicionar("José");
		lista.adicionar("Thiago");
		
		lista.remover(0);
		System.out.println(lista);
	}

}
