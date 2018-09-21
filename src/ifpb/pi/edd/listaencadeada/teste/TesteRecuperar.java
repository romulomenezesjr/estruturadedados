package ifpb.pi.edd.listaencadeada.teste;

import ifpb.pi.edd.listaencadeada.ListaEncadeada;

public class TesteRecuperar {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.inicializa();
		
		lista.adicionar("Rômulo");
		lista.adicionar("Maria");
		System.out.println(lista.recuperar(1));
	}

}
