package controller;

public class ControllerInverte {

	public ControllerInverte() {
		super();
	}
	
	public int[] inverteVetor(int[] vetor, int esquerda, int direita) {
		int aux;
		if(direita ==  esquerda) {
			return vetor;
		}else if(direita - esquerda == 1) {
			aux = vetor[direita];
			vetor[direita] = vetor[esquerda];
			vetor[esquerda] = aux;
			return vetor;
		}else {
			aux = vetor[direita];
			vetor[direita] = vetor[esquerda];
			vetor[esquerda] = aux;
			return inverteVetor(vetor, esquerda + 1, direita - 1);
		}
	}
	
}
