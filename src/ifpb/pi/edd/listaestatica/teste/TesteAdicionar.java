package ifpb.pi.edd.listaestatica.teste;

import ifpb.pi.edd.lista.Lista;
import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteAdicionar {
	public static void main(String[] args) {
	
		Lista lista = new ListaEstatica();
		lista.inicializa();
		lista.adicionar(0, "Rômulo");
		lista.adicionar(0, "José");
		lista.adicionar(0, "Thiago");
		System.out.println(lista);
		
	}
}
