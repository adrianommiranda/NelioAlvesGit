package app;

import java.util.Date;

import entities.Ordem;
import entities.enums.OrdemStatus;

public class Aplication {

	public static void main(String[] args) {
		
		Ordem ordem = new Ordem(3, new Date(), OrdemStatus.ENTREGUE);
		
		System.out.println(ordem.toString());
		
		
		//Convertendo String para enum
		OrdemStatus os1 = OrdemStatus.AGUARDANDO_PAGAMENTO;
		
		OrdemStatus os2 = OrdemStatus.valueOf("AGUARDANDO_PAGAMENTO");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
