package ifpb.pi.edd.listaencadeada.teste;

import ifpb.pi.edd.lista.Lista;
import ifpb.pi.edd.listaestatica.ListaEstatica;

public class TesteVerificar {
	
	public static void main(String[] args) {
		Lista lista = new ListaEstatica();
		lista.inicializa();
		lista.adicionar("R�mulo");
		System.out.println(lista.verificar("R�mulo"));
	}

}
