import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEge(0,1);
        graph.addEge(0,2);
        graph.addEge(1,3);
        graph.addEge(3,1);
        graph.addEge(2,1);

        graph.print();

    }
}