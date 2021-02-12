package algo;

public class AdjGraph {
	int vertex=4;
    LinkedList list[]=new LinkedList[vertex];
   
    AdjGraph() {
        for (int i=0; i<vertex;i++) {
            list[i]=new LinkedList() ;
               
           
        }
       
    }
    public void addedge(int source, int destination) {
        list[source].addNode(destination);
        list[destination].addNode(source);
    }
    public void printGraph() {
        for (int i =0; i<vertex; i++) {
            System.out.print(i+"is connected to=");
            if(list[i].size()>0) {
                for(int j=0; j<list[i].size();j++) {
                    System.out.print(list[i].get(j)+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        AdjGraph adj=new AdjGraph();
        adj.addedge(0, 1);
        adj.addedge(0, 2);
        adj.addedge(1, 2);
        adj.addedge(2, 3);
        adj.printGraph();
    }


}
