package ifpb.pi.edd.listaencadeada.teste;

import ifpb.pi.edd.listaencadeada.ListaEncadeada;

public class TesteRemover {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.inicializa();
		
		lista.adicionar("R�mulo");
		lista.adicionar("R�mulo1");
		lista.adicionar("R�mulo2");
		lista.remover(0);
		System.out.println(lista.toString());
//		lista.adicionar("R�mulo3");
//		lista.adicionar("R�mulo4");
//		lista.adicionar("R�mulo5");
//		System.out.println(lista.toString());
//		lista.remover(3);
//		System.out.println(lista.toString());

	}

}
