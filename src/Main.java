import java.util.*;

public class Main {
    public static void main(String[] args) {
        Problema laberinto = new Laberinto();

        DFS dfs = new DFS();
        List<String> solucionDFS = dfs.buscar(laberinto);
        System.out.println("DFS: " + (solucionDFS != null ? solucionDFS : "No encontrada"));

        BFS bfs = new BFS();
        List<String> solucionBFS = bfs.buscar(laberinto);
        System.out.println("BFS: " + (solucionBFS != null ? solucionBFS : "No encontrada"));

        BusquedaHillClimbing hill = new BusquedaHillClimbing();
        List<String> solucionHill = hill.buscar(laberinto);
        System.out.println("Hill Climbing: " + (solucionHill != null ? solucionHill : "No encontrada"));
    }
}
