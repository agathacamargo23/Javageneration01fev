package aula01fev;

public class TestaAnCachCavaPreExe01 {

	public static void main(String[] args) {
		
		Cachorro dogA = new Cachorro();
		Cavalo cavB = new Cavalo();
		Pregui�a preC = new Pregui�a();
		
		dogA.setNome("Quardi�o do Trov�o");
		dogA.setIdade(7);
		dogA.setSom("O c�o latiu... AUAUAU");
		dogA.setCorrer("O c�o correu muito veloz...");
		
		cavB.setNome("Trov�o");
		cavB.setIdade(6);
		cavB.setSom("O cavalo relinchou... hihihhh");
		cavB.setCorrer("O cavalo correu bem longe...");
		
		preC.setNome("Filomena");
		preC.setIdade(10);
		preC.setSom("A pregui�a AHHHHH ");
		preC.setSubirEmArvore("A pregui�a subiu lentamentnte a arv�re...");
		
		
		System.out.println("O nome do dog �: " + dogA.getNome());
		System.out.println("A  idade do c�o �: " + dogA.getIdade());
		System.out.println("O c�o latiu " + dogA.getSom());
		System.out.println("O c�o correu para longe " + dogA.getCorrer());
		System.out.println();
		
		System.out.println("O nome do cavalo �: " + cavB.getNome());
		System.out.println("A idade  do c�o �: " + cavB.getIdade());
		System.out.println("O cavalo relinchou: " + cavB.getSom());
		System.out.println("O cavalo correu: " + cavB.getCorrer());
		System.out.println();
		
		System.out.println("O nome da pregui�a �: "+ preC.getNome());
		System.out.println("A idade �: "+ preC.getIdade());
		System.out.println("A som da pregui�a �: "+ preC.getSom());
		System.out.println("A pregui�a escalou a arv�re: "+ preC.getSubirEmArvore());

	}

}
