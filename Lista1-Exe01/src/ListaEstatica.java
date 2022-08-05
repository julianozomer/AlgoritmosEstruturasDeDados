
public class ListaEstatica {
	private int[] info;
	private int tamanho;
	
	
	//a)
	public ListaEstatica() {
		info = new int[10];
	}
	
	//b)
	public int[] redimensionar() {
		int[] novo;
		int novoTamanho;
		
		novoTamanho = info.length + 10;
		novo = new int[novoTamanho];
		
		for (int i = 0; i <= tamanho - 1; i++) {
			novo[i] = info[i];
		}
		
		info = novo;
		
		return info;
	}
	
	//c)
	public void inserir(int valor) {
		if (tamanho == info.length) {
			redimensionar();
		}
			
		info[tamanho] = valor;
		tamanho++;
	}
	
	//d)
	public void exibir() {
		for (int i = 0; i <= tamanho; i++) {
			System.out.println(info[i]);
		}
	}
	
	//e)
	public int buscar(int valor) {
		int posicao = -1;
		
		for (int i = 0; i <= tamanho; i++) {
			if (info[i] == valor) {
				posicao = i;
				return posicao;
			}
		}
		
		return posicao;
	}
	
	//f)
	public void retirar(int valor) {
		
	}
	
}
