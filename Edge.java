package exercise_7;

public class Edge {
		Node node;
		int cost;
		public Edge(Node node, int cost){
			this.node=node;
			this.cost = cost;
			}
		public Node getNode() {
			return this.node;
		}
		public int getCost() {
			return this.cost;
		}
		
}
