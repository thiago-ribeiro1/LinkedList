package util;

public class Lista {

	Node cabeca; // Cabeça da lista (primeiro nó)
	Node cauda; // Cauda da lista (último nó)

	public void adicionar(String valor) {
		Node n = new Node();
		n.setValor(valor);
		if (cabeca == null) { // Verifica se a lista está vazia
			cabeca = n; 
			cauda = n;
		} else {
			cauda.setProximo(n); // Se a lista não estiver vazia, atualiza o próximo do nó cauda para o novo nó
			cauda = n; 
		}
	}

	public void remover(String valor) {

		Node anterior = cabeca; // Inicializa o nó anterior com a cabeça da lista
		Node atual = cabeca.proximo; // Inicializa o nó atual com o próximo nó após a cabeça

		while (atual != null) {
			if (atual.valor.equals(valor)) { // Verifica se o valor digitado é igual ao valor que desejamos remover
				anterior.proximo = atual.proximo; // Remove o nó digitado da lista, atualizando o ponteiro para o
													// próximo valor após ele
				break;
			}
			anterior = anterior.proximo;
			atual = atual.proximo;
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node n = cabeca;
		if (n == null) {
			System.out.println("Lista vazia \n");
		} else {
			System.out.println("Lista: \n");
			while (n != null) {

				System.out.println(n.getValor() + " ");
				n = n.getProximo();
			}
		}
		return sb.toString();
	}

}
