import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.ContratoHora;
import entities.Departamento;
import entities.Trabalhador;
import entities.enums.NivelTrabalho;

public class app {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new  Scanner(System.in);
		
		//Data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o nome do Departamento: ");
		String nomeDeparnamento = scanner.next();
		
		Departamento departamento;
		//Departamento departamento = new Departamento(nomeDeparnamento);
		
		System.out.println("Entre com os dados do trabalhador:");
		
		System.out.print("Informe o nome do funcionário: ");
		String nomeFuncionario = scanner.next();
		
		System.out.print("Informe o nível do funcionário: ");
		String nivelFuncionario = scanner.next();
		
		System.out.print("Informe a base salarial do funcionário: ");
		double baseSalarial = scanner.nextDouble();
		
		//Trabalhador trabalhador = new Trabalhador(nomeFuncionario, NivelTrabalho.valueOf(nivelFuncionario), baseSalarial, departamento);
		
		//Outra forma
		Trabalhador trabalhador = new Trabalhador(nomeFuncionario, NivelTrabalho.valueOf(nivelFuncionario), baseSalarial, new Departamento(nomeDeparnamento));
		
		
		System.out.println(trabalhador.toString());
		
		
		System.out.println("Informa a quantidade de contratos");
		int n = scanner.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Informe o #"+ i +" contrato");
			System.out.println("Informe a data DD/MM/YYYY");
			Date dataContrato = sdf.parse(scanner.next());
			System.out.print("");
						
			System.out.println("Valor da hora trabalhada");
			double valorHora = scanner.nextDouble();
			System.out.println("Quantdade de hora trabalhada");
			int qtdValor = scanner.nextInt();
			
			ContratoHora contrato = new ContratoHora(dataContrato, valorHora, qtdValor);
			
			trabalhador.adicionarContrato(contrato);
			
		}
		
		System.out.println();
		System.out.println("Entre com o mês e ano para calcular o salario (MM/YYYY)");
		String mesAno = scanner.next();
		int mes = Integer.parseInt( mesAno.substring(2,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		
		System.out.println("Nome" + trabalhador.getNome());
		System.out.println("Departamento" + trabalhador.getDepartamento().getNomeDepartamento());
		System.out.println("Ganhos " + mesAno + " informado " + String.format("%.2f", trabalhador.valorRecebido(ano, mes)));
		System.out.println("Nome" + trabalhador.getNome());
		
	}

}
