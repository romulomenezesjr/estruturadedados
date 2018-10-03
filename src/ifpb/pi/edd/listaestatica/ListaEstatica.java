package ifpb.pi.edd.listaestatica;

import ifpb.pi.edd.lista.Lista;

public class ListaEstatica implements Lista {

	private Object[] elementos;
	private int totalElementos;
	public static final int TAM_MAX = 100;

	public ListaEstatica() {

	}

	@Override
	public void inicializa() {
		this.elementos = new Object[TAM_MAX];
		this.totalElementos = 0;
	}

	private void alocarEspaco() {
		if (this.totalElementos == this.elementos.length) {
			Object[] novoArray = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				novoArray[i] = this.elementos[i];
			}
			this.elementos = novoArray;
		}
	}

//	public void adicionar1(Object elemento) {
//		for (int i = 0; i < this.elementos.length; i++) {
//			if (this.elementos[i] == null) {
//				this.elementos[i] = elemento;
//				break;
//			}
//		}
//	}


	@Override
	public void adicionar(Object elemento) {
		this.elementos[this.totalElementos] = elemento;
		this.totalElementos++;
	}

	@Override
	public void adicionar(int posicao, Object e) {
		this.alocarEspaco();
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = this.totalElementos - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = e;
		this.totalElementos++;

	}

	public Object recuperar(int posicao) {
		if (! this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= this.totalElementos;
	}

	@Override
	public void remover(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.totalElementos - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.totalElementos--;
	}

	@Override
	public boolean verificar(Object e) {

		// for (Elemento elemento : elementos){
		// if (elemento.equals(e))
		// return true;
		// }

		for (int i = 0; i < this.totalElementos; i++) {
			if (e.equals(this.elementos[i])) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int tamanho() {
		return totalElementos;
	}

	public String toString() {
		if (this.tamanho() == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalElementos - 1; i++) {
			builder.append(this.elementos[i]);
			builder.append(", ");
		}
		builder.append(this.elementos[this.totalElementos - 1]);
		builder.append("]");
		return builder.toString();
	}

}
