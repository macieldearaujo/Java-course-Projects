package _07_arrays_lists_memory;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nomes = new String[] {"Barbara", "Douglas", "Maria", "Isabelly"};
		
		for(int i = 0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("-------------------------------------");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
	}

}
