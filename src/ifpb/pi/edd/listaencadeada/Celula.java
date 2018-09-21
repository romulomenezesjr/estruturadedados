package ifpb.pi.edd.listaencadeada;

public class Celula {
	
	private Celula proxima;
	private Object elemento;

	public Celula(Celula proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public Celula(Object elemento) {
		this.elemento = elemento;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setElemento(Object elemento) {
		this.elemento=elemento;
	}
	
	public Object getElemento() {
		return elemento;
	}
}
