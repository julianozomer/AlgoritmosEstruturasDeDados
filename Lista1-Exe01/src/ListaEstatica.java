public class ListaEstatica {
	private int[] info;
	private int tamanho;
	
	
	//a)
	public ListaEstatica() {
		info = new int[10];
	}
	
	//b)
	private int[] redimensionar() {
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
		int posicaoValor;
		
		posicaoValor = this.buscar(valor);
		
		if(posicaoValor != -1) {
			for(int i = posicaoValor; i < tamanho; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
		}
		
	}
	
	//g)
	public void liberar() {
		int[] novo = new int[10];
		
		info = novo;
	}

    //h)
    public int obterElemento(int pos) throws IndexOutOfBoundsException{
        return info[pos];
    }

    //i)
    public boolean estaVazia(){
        if (tamanho == 0){
            return true;
        } else {
            return false;
        }
    }

    //j)
    public int getTamanho(){
        return tamanho;
    }

    //k)
    public String toString(){
        String txt;

        for(int i = 0; i <= getTamanho() - 1; i++){
            return txt += info[i] + ", ";
        }
    }
	
}
