package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Vexe {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		
		Cliente cli = new Cliente("Adriano", "email.gmail", sdf.parse("16/01/1982"));
		
		System.out.println(cli.toString());
	}

}
