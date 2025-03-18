package application;

import java.text.ParseException; // Exce��o lan�ada quando h� erro ao converter uma string para Date.
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Comentarios;
import entities.Post;

public class app {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Define o formato esperado da data.
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Gigante como sempre");
		Comentarios c2 = new Comentarios("Melhor est�rio do mundo");
		
		 
		int like = 0;
		
		
		// Entrada de data 
        System.out.print("Entre com a data do post (dd/MM/yyyy HH:mm:ss): ");
        
        //L� a entrada do usu�rio como String.
        String dataStr = scanner.nextLine();
        
        Date data = null;
        
        try {
        	//Converte a string digitada pelo usu�rio em um objeto Date
            data = sdf.parse(dataStr);
        } catch (ParseException e) {
            System.out.println("Formato de data inv�lido. Usando data atual.");
            //Se o usu�rio digitar a data em formato incorreto, o try-catch captura o erro e define a data como a data e hora atuais (new Date();).
            data = new Date();
        }
        
        //fim data ----------------
        
		System.out.print("Entre com o t�tulo: ");
		String titulo =  scanner.nextLine();
		System.out.print("Entre com o assunto: ");
		String assunto =  scanner.nextLine();
		System.out.print("Entre com a quantidade de likes: ");
		
		like =  scanner.nextInt();

		Post post = new Post(data, titulo, assunto, like);
		
		post.adicionarComentario(c1);
		post.adicionarComentario(c2);
		
		System.out.println("\n\n\n-------------------------------------------------------------------------------\n");
		System.out.println(post.toString());
	}

}
