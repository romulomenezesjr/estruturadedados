package ifpb.pi.edd.pilha.estatica;

import ifpb.pi.edd.pilha.Pilha;
import ifpb.pi.edd.pilha.PilhaVaziaException;

public class PilhaEstatica<T> implements Pilha<T> {
	/*
	 * Tamanho máximo fixo do vetor usado como pilha
	 */
	public static final int TAMANHO_MAX = 1000;

	/* Capacidade da pilha */
	private int qntElementos;

	/* Vetor usado como pilha */
	private T elementos[];

	/* índice do elemento do topo da pilha */
	private int topo = -1;

	/*
	 * inicia a pilha para usar um vetor com tamanho máximo CapacidadeMax
	 */
	public PilhaEstatica() {
		this(TAMANHO_MAX);
	}
	/*
	 * inicia a pilha para um arranjo com o tamanho fornecido; o parâmetro é o
	 * tamanho do vetor
	 */
	public PilhaEstatica(int tamanho) {
		this.qntElementos = tamanho;
		elementos = (T[]) new Object[this.qntElementos];
	}

	@Override
	public void empilha(T obj) throws PilhaCheiaException {
		if (tamanho() == qntElementos)
			throw new PilhaCheiaException("Pilha cheia!");
		topo++;
		elementos[topo] = obj;

	}

	@Override
	public T desempilha() throws PilhaVaziaException {
		if (vazia())
			throw new PilhaVaziaException("Pilha vazia!");
		T elemento = elementos[topo];
		elementos[topo] = null; // Libera P[topo] para a coleta de lixo
		topo--;
		return elemento;
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	@Override
	public boolean vazia() {
		if (topo == -1)
			return true;
		else
			return false;
	}

	@Override
	public T topo() throws PilhaVaziaException {
		if (vazia())
			return null;
		else
			return elementos[topo];
	}

	@Override
	public String toString() {
		if (vazia()) {
			return "[ ]";
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = topo; i > -1; i--) {
			sb.append("[ ");
			sb.append(elementos[i]);
			sb.append(" ]\n");
		}
		return sb.toString();
	}

}
