package ifpb.pi.edd.pilha;

import ifpb.pi.edd.pilha.estatica.PilhaCheiaException;

public interface Pilha<T> {
	
	public void empilha(T elemento) throws PilhaCheiaException;
	
	public T desempilha() throws PilhaVaziaException;
	
	public int tamanho();
	
	public boolean vazia();
	
	public T topo() throws PilhaVaziaException;

}
