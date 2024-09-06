package Agenda;

public class Main {

	public static void main(String[] args) {
		
		Agenda ag = new Agenda();
		
		ag.escrita("Felipe", "99999");
		ag.escrita("João", "88888");
		ag.escrita("LumahBoboca", "11111");
		
		System.out.println("Achar todos\n");
		ag.acharTodos();
		
		System.out.println("\nProcurar alguém especifico\n");
		ag.procura("Lumah");

	}

}
