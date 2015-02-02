package api;

/**
 * Represents one intance of a crew skill in progress
 * @author Cat Snacks
 *
 */
public class CrewSkill {
	char op;
	char crewskill;
	byte yield;
	short cost;
	String id="";
	
	public CrewSkill(char op, char crewskill, byte yield, short cost){
		this.op = op;
		this.crewskill = crewskill;
		this.yield = yield;
		this.cost = cost;
		setId();
	}
	
	public String getId(){
		return id;
	}
	
	public char getCrewSkill(){
		return crewskill;
	}
	
	public byte getYield(){
		return yield;
	}
	
	public short getCost(){
		return cost;
	}
	
	public char getOp(){
		return op;
	}
	
	private void setId(){
		id = crewskill + Byte.toString(yield) + Short.toString(cost);
	}
	
	
}
