package pacoteFilme;
import java.util.Date;
import java.text.SimpleDateFormat;

public class cadastroFilme {
   
	private String titulo;
	private String genero;
	private Date dataLancamento;
	private String ator;
	
public cadastroFilme(String titulo,String genero, Date dataLancamento, String ator ){
	super();
	this.titulo = titulo;
	this.genero = genero;
	this.dataLancamento = dataLancamento;
	this.ator = ator;
		
	
}


public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public Date getDataLancamento() {
	return dataLancamento;
}

public void setDataLancamento(Date dataLancamento) {
	this.dataLancamento = dataLancamento;
}

public String getAtor() {
	return ator;
}

public void setAtor(String ator) {
	this.ator = ator;
}
	
@Override
public String toString() {
	SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	return "filme [titulo =" + titulo + ", genero =" + genero + ",dataLancamento = " + formatoData.format(dataLancamento) + ", ator =" + ator + "]";
	
 }


public static void add(cadastroFilme filme) {
	cadastroFilme.add(filme);
	System.out.println(filme);
	
}


public static void remove(cadastroFilme filme4) {
	cadastroFilme.remove(filme4);
	System.out.println(filme4);
	
}







	
}
