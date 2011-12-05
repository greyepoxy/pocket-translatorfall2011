import java.util.ArrayList;


public class GraphNode
{
	private int numNeighbors;
	private String name;
	private int color;
	boolean colored;
	private ArrayList<GraphNode> neighbors;
	
	public GraphNode(String name)
	{
		this.numNeighbors = 0;
		this.name = name;
		this.color = -1;
		this.colored = false;
		this.neighbors = new ArrayList<GraphNode>();
	}
	
	public String Name()
	{
		return this.name;
	}
	
	public int NumNonColoredNeighbors()
	{
		int count = 0;
		for (GraphNode gn : this.neighbors) {
			if (!gn.colored) {
				count++;
			}
		}
		return count;
	}
	
	public int NumNeighbors()
	{
		return this.numNeighbors;
	}
	
	public void addNegihbor(GraphNode n)
	{
		this.neighbors.add(n);
		this.numNeighbors++;
	}
	
	public void removeNeighbor(GraphNode n)
	{
		if (this.neighbors.contains(n))
			this.neighbors.remove(n);
		this.numNeighbors--;
	}
	
	public ArrayList<GraphNode> Neighbors()
	{
		return this.neighbors;
	}
	
	public int Color()
	{
		return this.color;
	}
	
	//Look at neighbors color value
	//find an unused integer 0 through (SYSTEM_REGISTER_COUNT - 1)
	// this is the new color value for this node.
	public boolean FindColor()
	{
		boolean[] usedRegs = new boolean[Micro.SYSTEM_REGISTER_COUNT];
		for(int i = 0; i < Micro.SYSTEM_REGISTER_COUNT; i++){
			usedRegs[i] = false;
		}
		for (GraphNode n : this.neighbors){
			if (n.color != -1){
				usedRegs[n.color] = true;
			}
		}
		for(int i = 0; i < Micro.SYSTEM_REGISTER_COUNT; i++){
			if (!usedRegs[i]){
				this.color = i;
				return true;
			}
		}
		return false;
	}
}
