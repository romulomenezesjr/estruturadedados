package ifpb.pi.edd.lista;

public interface Lista {

	public void inicializa();
	
	public void adicionar(Object e);
	
	public void adicionar(int posicao, Object e);
	
	public Object recuperar(int posicao);
	
	public void remover(int posicao);
	
	public boolean verificar(Object e);
	
	public int tamanho();
}

