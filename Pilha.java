
public class Pilha {

	int elementos[];
	int topo;

	public Pilha() {
		elementos = new int[10];
		topo = -1; // Posição invalída do vetor;
	}

	public void push(int e) {
		if (isFull()) {
			throw new RuntimeException("Stack Overflow!");
			// Pilha cheias
		}

		topo++;
		elementos[topo] = e;
	}

	// Retorna um inteiro;
	public int pop() {
		if (isEmpety()) {
			throw new RuntimeException("Stack Empety!");
			// Pilha vazia
		}
		int e;
		e = elementos[topo];
		topo--;
		return e;
	}

	// Verificar se está vazia;
	public boolean isEmpety() {
		return (topo == -1);
	}

	// Verificar se está cheia;
	public boolean isFull() {
		return (topo == (elementos.length) - 1);
	}

	// Retornar o elemento do topo;
	public int top() {
		if (isEmpety()) {
			throw new RuntimeException("Stack Empety!");
		}
		return elementos[topo];

	}
}
