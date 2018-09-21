package ifpb.pi.edd.listaencadeada.teste;

import ifpb.pi.edd.listaencadeada.ListaEncadeada;

public class TesteRemover {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.inicializa();
		
		lista.adicionar("Rômulo");
		lista.adicionar("Rômulo1");
		lista.adicionar("Rômulo2");
		lista.remover(0);
		System.out.println(lista.toString());
//		lista.adicionar("Rômulo3");
//		lista.adicionar("Rômulo4");
//		lista.adicionar("Rômulo5");
//		System.out.println(lista.toString());
//		lista.remover(3);
//		System.out.println(lista.toString());

	}

}
