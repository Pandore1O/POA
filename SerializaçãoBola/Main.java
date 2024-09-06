package com.menezes.poa.serializacaobolas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		
		Bola bola = new Bola();
		
		bola.setCor("Verde");
		bola.setTamanho("10");
		
		try {
			
			File file = new File("c:/a/");
			
			if (!file.exists()) file.mkdir();
			
			FileOutputStream arqOutSerializado = new FileOutputStream("bola.ser");
			ObjectOutputStream objOutSerializado = new ObjectOutputStream(arqOutSerializado);
			
			objOutSerializado.writeObject(bola);
			objOutSerializado.close();
			
			System.out.println("--Antes--\n" + bola);
			
			bola.setCor("Amarelo");
			bola.setTamanho("7");
			
			System.out.println("--Depois--\n" + bola);
			
			FileInputStream arqInSerializado = new FileInputStream("bola.ser");
			ObjectInputStream objInSerializado = new ObjectInputStream(arqInSerializado);
			
			bola = (Bola) objInSerializado.readObject();
			objInSerializado.close();
			
			System.out.println("--Depois de recuperar--\n" + bola);	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
