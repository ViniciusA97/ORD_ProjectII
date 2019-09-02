package OrdenaçãoLinear;

public class ProjetoII {
	
	public static void main(String[] args) {
		
		
		
		
		
		
	}



	public static int [] selectionSort(int vector[], int array_size){
	
		int i, j;
		int min, temp;
	
		for (i = 0; i < array_size-1; i++){
  
			min = i;
			for (j = i+1; j < array_size; j++){
				if (vector[j] < vector[min]) min = j;
			}
	
			temp = vector[i];
			vector[i] = vector[min];
			vector[min] = temp;
		}
		
		return vector;
	}
	
	public static int [] insertionSort(int [] vetor) {
		
		
		int chave, aux;
		for (int i = 0; i < vetor.length; i++) {
			chave = vetor[i];
			aux = i-1;
			while(aux >= 0 && vetor[aux] > chave){
				vetor[aux+1] = vetor[aux];
				aux -= 1;
			}
			vetor[aux+1] = chave;
		}
		return vetor;
	}	
}

