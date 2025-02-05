// import java.util.*;

// class Graph {
//     private Map<String, List<Edge>> adjList;

//     public Graph() {
//         this.adjList = new HashMap<>();
//     }

//     public void addEdge(String source, String destination, int weight) {
//         this.adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Edge(destination, weight));
//         this.adjList.computeIfAbsent(destination, k -> new ArrayList<>()).add(new Edge(source, weight));
//     }

//     public void printAvailableDestinations() {
//         System.out.println("Available sources and destinations:");
//         for (String source : adjList.keySet()) {
//             System.out.print(source + " -> ");
//             for (Edge edge : adjList.get(source)) {
//                 System.out.print(edge.destination + " (" + edge.weight + " km), ");
//             }
//             System.out.println();
//         }
//     }

//     public List<String> getShortestPath(String start, String end) {
//         Map<String, Integer> distances = new HashMap<>();
//         Map<String, String> previous = new HashMap<>();
//         PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        
//         for (String vertex : this.adjList.keySet()) {
//             distances.put(vertex, Integer.MAX_VALUE);
//         }
//         distances.put(start, 0);
        
//         priorityQueue.add(new Edge(start, 0));
        
//         while (!priorityQueue.isEmpty()) {
//             Edge currentEdge = priorityQueue.poll();
//             String currentNode = currentEdge.destination;
            
//             if (currentNode.equals(end)) {
//                 break;
//             }
            
//             for (Edge neighbor : this.adjList.getOrDefault(currentNode, new ArrayList<>())) {
//                 int newDist = distances.get(currentNode) + neighbor.weight;
//                 if (newDist < distances.get(neighbor.destination)) {
//                     distances.put(neighbor.destination, newDist);
//                     previous.put(neighbor.destination, currentNode);
//                     priorityQueue.add(new Edge(neighbor.destination, newDist));
//                 }
//             }
//         }

//         List<String> path = new ArrayList<>();
//         for (String at = end; at != null; at = previous.get(at)) {
//             path.add(at);
//         }
//         Collections.reverse(path);

//         return path;
//     }

//     public int getPathDistance(String start, String end) {
//         List<String> path = getShortestPath(start, end);
//         int distance = 0;

//         for (int i = 0; i < path.size() - 1; i++) {
//             String current = path.get(i);
//             String next = path.get(i + 1);
//             for (Edge edge : adjList.get(current)) {
//                 if (edge.destination.equals(next)) {
//                     distance += edge.weight;
//                     break;
//                 }
//             }
//         }

//         return distance;
//     }

//     private static class Edge {
//         String destination;
//         int weight;

//         public Edge(String destination, int weight) {
//             this.destination = destination;
//             this.weight = weight;
//         }
//     }
// }
// public class TravelPlanner {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Graph graph = new Graph();

//         // Add edges between destinations
//         graph.addEdge("New York", "Chicago", 800);
//         graph.addEdge("New York", "Boston", 215);
//         graph.addEdge("Chicago", "Denver", 1000);
//         graph.addEdge("Denver", "San Francisco", 1250);
//         graph.addEdge("Boston", "San Francisco", 2700);
//         graph.addEdge("Boston", "Miami", 1500);
//         graph.addEdge("Miami", "New York", 1300);
//         graph.addEdge("Chicago", "San Francisco", 2000);

//         // Print available sources and destinations
//         graph.printAvailableDestinations();

//         // Take user input for source and destination
//         System.out.println("Enter the source city:");
//         String source = scanner.nextLine();
//         System.out.println("Enter the destination city:");
//         String destination = scanner.nextLine();

//         // Find the shortest path and distance
//         List<String> path = graph.getShortestPath(source, destination);
//         int distance = graph.getPathDistance(source, destination);

//         // Display the results
//         System.out.println("Shortest path from " + source + " to " + destination + ": " + String.join(" -> ", path));
//         System.out.println("Total distance: " + distance + " km");
//     }
// }
