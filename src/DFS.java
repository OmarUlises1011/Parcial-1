import java.util.*;

public class DFS {
    public List<String> buscar(Problema problema) {
        Stack<Nodo> frontera = new Stack<>();
        Set<Estado> explorados = new HashSet<>();
        frontera.push(new Nodo(problema.inicial, null, 0));

        while (!frontera.isEmpty()) {
            Nodo actual = frontera.pop();
            if (actual.estado.esIgual(problema.meta)) return reconstruirSolucion(actual);
            if (explorados.contains(actual.estado)) continue;

            explorados.add(actual.estado);
            for (Estado s : problema.sucesores(actual.estado)) {
                if (!explorados.contains(s)) {
                    frontera.push(new Nodo(s, actual, actual.costo + 1));
                }
            }
        }
        return null;
    }

    private List<String> reconstruirSolucion(Nodo nodo) {
        List<String> solucion = new ArrayList<>();
        while (nodo != null) {
            solucion.add(nodo.estado.toString());
            nodo = nodo.padre;
        }
        Collections.reverse(solucion);
        return solucion;
    }
}
