
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
		JSR
	}
	
	public IROp opCode;
	public String op1;
	public String op2;
	public String result;
	
}
