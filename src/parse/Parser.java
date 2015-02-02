package parse;

import api.CrewSkill;

public class Parser {
	
	private final String ARCHAEOLOGY = "Archaeology";
	private final String BIOANALYSIS = "Bioanalysis";
	private final String SCAVENGING = "Scavenging";
	private final String SLICING = "Slicing";
	private final String DIPLOMACY = "Diplomacy";
	private final String INVESTIGATION = "Investigation";
	private final String TREASUREHUNTING = "Treasure Hunting";
	private final String UNDERWORLDTRADING = "Underworld Trading";
	private final String MODERATE = "Moderate";
	private final String ABUNDANT = "Abundant";
	private final String BOUNTIFUL = "Bountiful";
	private final String RICH = "Rich";
	private final String NOT_FOUND = "Not Found";
	
	
	/**
	 * Parses a gather command
	 * @param in gather command
	 * @return
	 */
	public CrewSkill parseGather(String in){
		char operation = in.charAt(0);
		// if command specifies gather mission
		if(operation=='g'){
			char crewskill = in.charAt(1);
			byte yield = Byte.parseByte(in.substring(2, 3));
			short cost = Short.parseShort(in.substring(3));
			return new CrewSkill(operation, crewskill, yield, cost);
			
		}else if(operation=='c'){
			
		}
		return null;
	}
	
	public String getCrewSkillName(char crewskill){
		if(crewskill=='a')
			return ARCHAEOLOGY;
		else if(crewskill=='b')
			return BIOANALYSIS;
		else if(crewskill=='s')
			return SCAVENGING;
		else if(crewskill=='l')
			return SLICING;
		else if(crewskill=='d')
			return DIPLOMACY;
		else if(crewskill=='i')
			return INVESTIGATION;
		else if(crewskill=='t')
			return TREASUREHUNTING;
		else if(crewskill=='u')
			return UNDERWORLDTRADING;
		else
			return NOT_FOUND;
	}
	
	public String getYieldName(byte yield){
		if(yield==1)
			return MODERATE;
		else if(yield==2)
			return ABUNDANT;
		else if(yield==3)
			return BOUNTIFUL;
		else if(yield==4)
			return RICH;
		else
			return NOT_FOUND;
	}
}
