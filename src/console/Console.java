package console;

import java.util.Scanner;

import api.CSMAMain;

public class Console {
	private static final String START = "start";
	private static final String LIST = "list";
	private static final String FINISH = "finish";
	private static Scanner s;
	private static CSMAMain csma; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		console();
	}
	
	public static void console(){
		csma = new CSMAMain();
		String in;
		s = new Scanner(System.in);
		while(!(in = s.next()).equals("exit")){
			if(in.toLowerCase().equals(START)){
				start(s.next());
			}else if(in.toLowerCase().equals(FINISH)){
				finish(s.next(), s.next());
			}else if(in.toLowerCase().equals(LIST)){
				list();
			}
		}
		s.close();
	}
	
	private static void start(String cmd){
		if(cmd.charAt(0)=='g')
			csma.newGatherInProgress(cmd);
		
	}
	
	private static void finish(String cmd, String yield){
		if(cmd.charAt(0)=='g')
			csma.finishGatherInProgress(cmd);
	}
	
	private static void list(){
		csma.printCrewSkillList();
	}
}
