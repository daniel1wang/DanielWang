import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;
    public static final Queue<Integer> trackQueue = new LinkedList<>();
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        if (trackQueue.isEmpty()) {
            Node start = graph.get(0);
            if (!start.isVisited()) {
                trackQueue.add(start.getKey());
            } else {
                System.out.println("Finished");
                return;
            }
        }

        Integer currentKey = trackQueue.poll();
        Node currentNode = graph.get(currentKey - 1);
        for (Integer queueNode : currentNode.getNodes()) {
            currentNode.setVisited(true);
            if (!graph.get(queueNode - 1).isVisited()) {
               trackQueue.add(queueNode);
               graph.get(queueNode - 1).setVisited(true);
            }
        }

        if (currentKey == null) {
            System.out.println("Cannot be null.");
            return;
        }

        System.out.println("Queue contents: " + trackQueue);
        BFS();
    }


    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("/Users/danielwanghomefolder/IdeaProjects/BFS 3.3/src/tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}