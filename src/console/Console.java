package console;

import java.util.Scanner;

import api.CSMAMain;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		console();
	}
	
	public static void console(){
		CSMAMain csmg = new CSMAMain();
		String in;
		Scanner s = new Scanner(System.in);
		while(!(in = s.nextLine()).equals("exit")){
			csmg.consoleIn(in);
		}
	}

}
