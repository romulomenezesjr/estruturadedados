package ifpb.pi.edd.listaestatica.teste;

import ifpb.pi.edd.lista.Lista;
import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteAdicionar {
	public static void main(String[] args) {
	
		Lista lista = new ListaEstatica();
		lista.inicializa();
		lista.adicionar("R�mulo");
		lista.adicionar("Jos�");
		lista.adicionar("Thiago");
		System.out.println(lista);
		
	}
}
