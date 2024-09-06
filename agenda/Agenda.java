package Agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Agenda {
	
	public void escrita(String nome, String telefone) {
		
		try {
			FileWriter fileWriter = new FileWriter("agenda.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(nome + ";" + telefone);
			bufferedWriter.newLine();
			bufferedWriter.close();
			fileWriter.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void acharTodos() {
		FileReader fileReader;
		try {
			fileReader = new FileReader("agenda.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while (bufferedReader.ready()) {
				String aux = bufferedReader.readLine();
				String[] dados = aux.split(";");
				System.out.println("Nome: " + dados[0] + ", Telefone: " + dados[1] + "\n");
			}
			
			bufferedReader.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void procura(String nome) {
		FileReader fileReader;
		try {
			fileReader = new FileReader("agenda.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			boolean encontrado = false;
			
			while (bufferedReader.ready()) {
				String aux = bufferedReader.readLine();
				
				if (aux.toLowerCase().contains(nome.toLowerCase())) {
					String[] dados = aux.split(";");
					System.out.println("Nome: " + dados[0] + ", Telefone: " + dados[1]);
					encontrado = true;
				}
				
				if (encontrado) {
					bufferedReader.close();
					fileReader.close();
					System.out.println("Encontrado.");
					break;
				}
				
			}
			
			bufferedReader.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
