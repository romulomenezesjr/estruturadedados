package ifpb.pi.edd.listaencadeada.teste;

import ifpb.pi.edd.lista.Lista;
import ifpb.pi.edd.listaencadeada.ListaEncadeada;

public class TesteInicializar {
	
	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		lista.inicializa();
		System.out.println(lista.tamanho());
	}

}
