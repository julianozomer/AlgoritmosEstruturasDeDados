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
		
		for (int i = 0; i < tamanho; i++) {
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
			for(int i = posicaoValor; i < tamanho - 1; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
		}
		
	}
	
	//g)
	public void liberar() {
		info = new int[10];
		tamanho = 0;
	}

    //h)
    public int obterElemento(int posicao){
        if (posicao >= 0 && (posicao < tamanho)) {
        	return info[posicao];
        } else {
        	throw new IndexOutOfBoundsException();
        }
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
        String txt = "";

        for(int i = 0; i <= getTamanho() - 1; i++){
        	txt += info[i] + ", ";
        }
        return txt;
    }
	
}
