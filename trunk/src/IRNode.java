import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;




public class IRNode {
	
	public enum IROp {
		ADDI,
		ADDF,
		SUBI,
		SUBF,
		MULTI,
		MULTF,
		DIVI,
		DIVF,
		STOREI,
		STOREF,
		BGEI,
		BGTI,
		BLEI,
		BLTI,
		BNEI,
		BEQI,
		BGEF,
		BGTF,
		BLEF,
		BLTF,
		BNEF,
		BEQF,
		JUMP,
		LABEL,
		READI,
		READF,
		WRITEI,
		WRITEF,
		WRITES,
		JSR, 
		PSH,
		POP,
		RET,
		LINK
	}
	
	public IROp opCode;
	public String op1;
	public String op2;
	public String result;
	public ArrayList<IRNode> parents;
	public ArrayList<IRNode> children;
	public Set<String> inSet;
	public Set<String> outSet;
	
	public IRNode()
	{
		parents = new ArrayList<IRNode>();
		children = new ArrayList<IRNode>();
		inSet = new TreeSet<String>();
        outSet = new TreeSet<String>();	
	}
	
	public String toString()
	{
		return opCode + " " + op1 + " " + op2 +  " " + result;
	}
	
public TreeSet<String> getGen() {
		
		TreeSet<String> genSet = new TreeSet<String>();
		
		switch(opCode)
		{		
		case JUMP:
		case RET:
		case LINK:
		case LABEL: //none of these kill anything
		default:
			break;
		case ADDI:
		case ADDF:
		case SUBI:
		case SUBF:
		case MULTI:
		case MULTF:
		case DIVI:
		case DIVF:
		case STOREI:
		case STOREF:
		case BEQF:
		case BEQI:
		case BGEI:
		case BGTI:
		case BLEI:
		case BLTI:
		case BNEI:			
		case BGEF:
		case BGTF:
		case BLEF:
		case BLTF:
		case BNEF: 		
		case PSH:
		case WRITEI:
		case WRITEF:
		case WRITES:
			if(!op1.equals(""))
			{
				try
				{
					float literal = Float.parseFloat(op1);
					
				}
				catch(NumberFormatException e)
				{
					genSet.add(op1);
				}
				
			}
			if(!op2.equals(""))
			{
				try
				{
					float literal = Float.parseFloat(op1);
					
				}
				catch(NumberFormatException e)
				{
					genSet.add(op2);
				}
			}
			break;
			
		}
		
		return genSet;
	}

	public TreeSet<String> getKill() {
		
		TreeSet<String> killSet = new TreeSet<String>();
		
		switch(opCode)
		{
		case BEQF:
		case BEQI:
		case BGEI:
		case BGTI:
		case BLEI:
		case BLTI:
		case BNEI:			
		case BGEF:
		case BGTF:
		case BLEF:
		case BLTF:
		case BNEF: 
		case JUMP:
		case PSH:
		case WRITEI:
		case WRITEF:
		case WRITES:
		case RET:
		case LINK:
		case LABEL: //none of these kill anything
		default:
			break;
		case ADDI:
		case ADDF:
		case SUBI:
		case SUBF:
		case MULTI:
		case MULTF:
		case DIVI:
		case DIVF:
		case STOREI:
		case STOREF:
		case POP:
		case READI:
		case READF://these all kill something... the result
			killSet.add(result);
			break;
			
		}
		
		return killSet;
	}
	public boolean IsSingletonOp()
	{
		boolean toRet = false;
		
		switch(opCode)
		{
		case RET:
		case JUMP:
		case LABEL:
		case JSR:
		case LINK:
			return true;
		}
		return toRet;
	}
	
	
}
