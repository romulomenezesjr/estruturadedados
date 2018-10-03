package ifpb.pi.edd.lista.teste;

import ifpb.pi.edd.lista.Lista;
import ifpb.pi.edd.listaencadeada.ListaEncadeada;
import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteAdicionarNoComeco {

	public static void main(String[] args) {
		Lista listaEstatica = new ListaEstatica();
		Lista listaEncadeada = new ListaEncadeada();
		listaEstatica.inicializa();
		listaEncadeada.inicializa();
		int numeroDeElementos = 50000;

		// ADICIONADO NO COMEÇO
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {listaEstatica.adicionar(0, "" + i);}
		long fim = System.currentTimeMillis();
		System.out.println("Lista Estática adiciona no começo: " + (fim - inicio) / 1000.0);
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) {listaEncadeada.adicionar(0, "" + i);}
		fim = System.currentTimeMillis();
		System.out.println("Lista Encadeada adiciona no começo: " + (fim - inicio) / 1000.0);
	}
}
