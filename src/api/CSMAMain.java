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
		
		public void newGatherInProgress(String cmd){
			CrewSkill cs = p.parseGather(cmd);
			csl.add(cs);
		}
		
		public boolean finishGatherInProgress(String cmd){
			CrewSkill cs = p.parseGather(cmd);
			for(int i=0;i<csl.size();i++){
				if(crewSkillsAreEqual(cs, csl.get(i))){
					csl.remove(i);
					return true;
				}
			}
			return false;
		}
		
		private boolean crewSkillsAreEqual(CrewSkill c1, CrewSkill c2){
			if(c1.getCrewSkill()==c2.getCrewSkill() &&
					c1.getYield()==c2.getYield() && c1.getCost()==c2.getCost())
				// if the crew skills are equal
				return true;
			// if not equal
			return false;
				
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
