package api;

import java.util.LinkedList;

import parse.Parser;

/**
 * Main api class, contains all callable methods needed to use CSMG
 * @author Cat Snacks
 *
 */
public class CSMAMain {
		Parser p;
		LinkedList<CrewSkill> csl;
		
		public CSMAMain() {
			this.p = new Parser();
			csl = new LinkedList<CrewSkill>();
		}
		
		public void consoleIn(String in){
			in = in.toLowerCase();
			char op = in.charAt(0);
			
			if(op == 'g' || op == 'c'){
				CrewSkill cs = p.parse(in);
				if(cs!=null){
					csl.add(cs);
				}
			}else if(op == 'l'){
				//printlist
				printCrewSkillList();
			}else if(op == 'f'){
				//finishmission
			}
		}
		
		public void printCrewSkillList(){
			for(int i=0; i<csl.size(); i++){
				CrewSkill cs = csl.get(i);
				String crewskill = p.getCrewSkillName(cs.getCrewSkill());
				String yield = p.getYieldName(cs.getYield());
				System.out.printf("%d: %s  %s  %d (%c%c%d%d)\n",
						i+1, crewskill, yield, cs.getCost(), cs.getOp(), cs.getCrewSkill(),
						cs.getYield(), cs.getCost());
			}
		}
}
