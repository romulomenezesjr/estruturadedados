package ifpb.pi.edd.lista.teste;

import ifpb.pi.edd.lista.Lista;
import ifpb.pi.edd.listaencadeada.ListaEncadeada;
import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteRemoverDoComeco {

	public static void main(String[] args) {
		ListaEstatica listaEstatica = new ListaEstatica();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		listaEstatica.inicializa();
		listaEncadeada.inicializa();
		int numeroDeElementos = 50000;
		for (int i = 0; i < numeroDeElementos; i++) {listaEstatica.adicionar(0, "" + i);}
		for (int i = 0; i < numeroDeElementos; i++) {listaEncadeada.adicionar(0, "" + i);}

		long inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) { listaEstatica.remover(0); }
		long fim = System.currentTimeMillis(); 
		System.out .println("Lista Estática percorrendo: " + (fim - inicio) / 1000.0);
		inicio = System.currentTimeMillis();
		for (int i = 0; i < numeroDeElementos; i++) { listaEncadeada.remover(0); }
		fim = System.currentTimeMillis(); 
		System.out. println("Lista Encadeada percorrendo: " + (fim - inicio) / 1000.0);
	}
}
