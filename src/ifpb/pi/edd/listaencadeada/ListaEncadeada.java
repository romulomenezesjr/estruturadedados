package ifpb.pi.edd.listaencadeada;

import ifpb.pi.edd.lista.Lista;

public class ListaEncadeada implements Lista {

	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos;

	@Override
	public void inicializa() {
		primeira = null;
		ultima = null;
		totalDeElementos = 0;
	}

	@Override
	public void adicionar(Object e) {
		if (this.totalDeElementos == 0) {
			adicionarNoComeco(e);
		} else {
			adicionaNoFinal(e);
		}
	}

	private void adicionaNoFinal(Object e) {
		Celula celulaNova = new Celula(null, e);
		this.ultima.setProxima(celulaNova);
		this.ultima = celulaNova;
		this.totalDeElementos++;
	}

	@Override
	public void adicionar(int posicao, Object e) {
		if (posicao == 0) {
			adicionarNoComeco(e);
		} else if (posicao == this.totalDeElementos) {
			this.adicionaNoFinal(e);
		} else {
			Celula anterior = pegarCelula(posicao - 1);
			Celula celulaNova = new Celula(anterior.getProxima(), e);
			anterior.setProxima(celulaNova);
			this.totalDeElementos++;
		}
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < tamanho();
	}

	private Celula pegarCelula(int posicao) {
		if (!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		Celula atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProxima();
		}
		return atual;
	}

	@Override
	public Object recuperar(int posicao) {
		return pegarCelula(posicao).getElemento();
	}

	@Override
	public void remover(int posicao) {
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		if (posicao == this.totalDeElementos - 1) {
			removeDoFim();
		} else if (posicao == 0) {
			removeDoComeco();
		} else {
			Celula anterior = pegarCelula(posicao - 1);
			Celula atual = pegarCelula(posicao);
			Celula proxima = atual.getProxima();
			anterior.setProxima(proxima);
			totalDeElementos--;
		}

	}

	private void removeDoFim() {
		if (!posicaoValida(this.totalDeElementos - 1)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		if (this.tamanho() == 1) {
			removeDoComeco();
		} else {
			Celula penultima = pegarCelula(this.tamanho() - 1);
			this.ultima = penultima;
			this.ultima.setProxima(null);
			this.totalDeElementos--;
		}
	}

	@Override
	public boolean verificar(Object e) {
		for (int i = 0; i < this.totalDeElementos; i++) {
			Celula atual = primeira;
			if (atual.getElemento().equals(e)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}

	@Override
	public int tamanho() {
		return this.totalDeElementos;
	}

	public void adicionarNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		if (this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}

	public void removeDoComeco() {
		if (!this.posicaoValida(0)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		Celula proxima = this.primeira.getProxima();
		this.primeira = proxima;
		this.totalDeElementos--;

		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}

	}

	@Override
	public String toString() {
		if (tamanho() == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		Celula atual = primeira;

		sb.append("[ ");
		for (int i = 0; i < totalDeElementos - 1; i++) {
			sb.append(atual.getElemento());
			sb.append(", ");
			atual = atual.getProxima();
		}
		sb.append(atual.getElemento());
		atual = atual.getProxima();

		sb.append(" ]");
		return sb.toString();
	}
}
