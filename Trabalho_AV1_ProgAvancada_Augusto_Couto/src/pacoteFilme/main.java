package pacoteFilme;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class main {
	

	public static void main(String[] args) throws ParseException {
		ArrayList<cadastroFilme> filme = new ArrayList<cadastroFilme> ();
		cadastroFilme filme1 = new cadastroFilme("Labirinto do Fauno", "Fantasia/Guerra",new SimpleDateFormat("dd/MM/yyyy").parse("15/11/2006"), "Ivana Baquero");
		cadastroFilme filme2 = new cadastroFilme("The Old Guard", "Acao/Fantasia",new SimpleDateFormat("dd/MM/yyyy").parse("02/07/2020"), "Charlize Theron");
		cadastroFilme filme3 = new cadastroFilme("Pantera Negra", "Acao/Aventura",new SimpleDateFormat("dd/MM/yyyy").parse("15/02/2018"), "Chadwick Boseman");
		cadastroFilme filme4 = new cadastroFilme("Titanc", "Romance/Drama",new SimpleDateFormat("dd/MM/yyyy").parse("16/01/1998"), "Kate Winslet");
		cadastroFilme filme5 = new cadastroFilme("The Conjuring", "Terror",new SimpleDateFormat("dd/MM/yyyy").parse("13/09/2013"), "Vera Farmiga");	
		
		//Metodo inserir
		
		filme.add(filme1);
		System.out.println(filme1);
		
		filme.add(filme2);
		System.out.println(filme2);
		
		filme.add(filme3);
		System.out.println(filme3);

		filme.add(filme4);
		System.out.println(filme4);
		
		filme.add(filme5);
		System.out.println(filme5);
		
		//Metodo excluir
		
		
		filme.remove(filme4);
		
		System.out.println("Quantos filmes disponiveis");
	    System.out.println(filme.size());
	    
	    System.out.println("Verificando, o filme 4 ainda está disponivel !!!");
	    System.out.println(filme.contains(filme4));
	    
	  //Metodo consultar
	    
	    System.out.println("Executar filmes disponiveis");
	    
	    for (int i = 0; i < filme.size(); i++) {
			 cadastroFilme c = filme.get(i);
			 System.out.println(c);
		 }
	    
	    
	}

	
	
	
}
