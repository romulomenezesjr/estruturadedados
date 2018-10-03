package ifpb.pi.edd.pilha.estatica.teste;

import ifpb.pi.edd.pilha.Pilha;
import ifpb.pi.edd.pilha.PilhaVaziaException;
import ifpb.pi.edd.pilha.estatica.PilhaCheiaException;
import ifpb.pi.edd.pilha.estatica.PilhaEstatica;

public class TesteEmpilhar {
	
	public static void main(String[] args) {
		Pilha pilha = new PilhaEstatica();
		try {
			pilha.empilha("Romulo");
			pilha.empilha("Maria");
			pilha.empilha("Joao");
			pilha.empilha("Joao");
			pilha.empilha("Joao");
			
			pilha.desempilha();
			pilha.desempilha();
			pilha.desempilha();
			
			System.out.println(pilha);
		
		} catch (PilhaCheiaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PilhaVaziaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
