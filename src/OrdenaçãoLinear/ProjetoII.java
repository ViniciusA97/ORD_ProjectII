package OrdenaçãoLinear;

import java.util.Scanner;

public class ProjetoII {
	
	static final String N1 = "src\\num.1000.1.in";
	static final String N2 = "src\\num.1000.2.in";
	static final String N3 = "src\\num.1000.3.in";
	static final String N4 = "src\\num.1000.4.in";
	
	static final String N5 = "src\\num.10000.1.in";
	static final String N6 = "src\\num.10000.2.in";
	static final String N7 = "src\\num.10000.3.in";
	static final String N8 = "src\\num.10000.4.in";
	
	static final String N9 = "src\\num.100000.1.in";
	static final String N10 = "src\\num.100000.2.in";
	static final String N11 = "src\\num.100000.3.in";
	static final String N12 = "src\\num.100000.4.in";
	
	public static void main(String[] args) {
		
		boolean cond = true;
		
		Scanner in = new Scanner(System.in);
		int [] vector;
		LeituraORD leitura = new LeituraORD();
		
		while(cond) {
			
			System.out.println("\nEscolha um arquivo e um método para ordenar: \n"
					+ "1- num.1000.1.in \n"
					+ "2 -num.1000.2.in \n"
					+ "3 -num.1000.3.in \n"
					+ "4 -num.1000.4.in \n \n"
					+ "5 -num.10000.1.in \n"
					+ "6 -num.10000.2.in \n"
					+ "7 -num.10000.3.in \n"
					+ "8 -num.10000.4.in \n \n"
					+ "9 -num.100000.1.in \n"
					+ "10 -num.100000.2.in \n"
					+ "11 -num.100000.3.in \n"
					+ "12 -num.100000.4.in \n \n"
					+ "//1 : Selection sort\n"
					+ "//2 : Insertion Srot\n"
					+ "/n entrada válida: 11/2, 1/1 ... \n 0 para finalizar");
			
			String entrada = in.nextLine();
			
			
			switch(entrada) {
				case "1/1":
					
					vector = leitura.ler(N1);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "1/2":
				
					leitura = new LeituraORD();
					vector = leitura.ler(N1);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "2/1":
					
					vector = leitura.ler(N2);
					vector = selectionSort(vector);
					printVector(vector);
					
					break;
				case "2/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N2);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "3/1":
					
					vector = leitura.ler(N3);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "3/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N3);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "4/1":
					vector = leitura.ler(N4);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "4/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N4);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "5/1":
					vector = leitura.ler(N5);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "5/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N5);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "6/1":
					vector = leitura.ler(N6);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "6/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N6);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "7/1":
					vector = leitura.ler(N7);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "7/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N7);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "8/1":
					vector = leitura.ler(N8);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "8/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N8);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "9/1":
					
					vector = leitura.ler(N9);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "9/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N9);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "10/1":
					vector = leitura.ler(N10);
					vector = selectionSort(vector);
					printVector(vector);
					break;
					
				case "10/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N10);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "11/1":
					vector = leitura.ler(N11);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "11/2":
					leitura = new LeituraORD();
					vector = leitura.ler(N11);
					vector = insertionSort(vector);
					printVector(vector);
					break;
				case "12/1":
					
					vector = leitura.ler(N12);
					vector = selectionSort(vector);
					printVector(vector);
					break;
				case "12/2":
					
					leitura = new LeituraORD();
					vector = leitura.ler(N12);
					vector = insertionSort(vector);
					printVector(vector);
					break;
					
				default:
					continue;
					
				case "0":
					cond = false;
					break;
			}
			
			
		}
		
		
		
		
	}



	public static int [] selectionSort(int vector[]){
	
		int i, j;
		int min, temp;
	
		for (i = 0; i < vector.length-1; i++){
  
			min = i;
			for (j = i+1; j < vector.length; j++){
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
	
	public static void printVector(int [] vector) {
		System.out.println("\n");
		for(int i: vector) {
			System.out.println(i);
		}
		
	}
}

