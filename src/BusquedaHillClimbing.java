import java.util.*;

public class BusquedaHillClimbing {
    public List<String> buscar(Problema problema) {
        Estado actual = problema.inicial;
        List<String> recorrido = new ArrayList<>();
        Set<Estado> visitados = new HashSet<>();

        while (true) {
            recorrido.add(actual.toString());
            visitados.add(actual);

            if (actual.esIgual(problema.meta)) return recorrido;

            List<Estado> sucesores = problema.sucesores(actual);
            Estado mejor = null;
            int hActual = heuristica(actual, problema.meta);
            int mejorH = hActual;

            for (Estado s : sucesores) {
                if (visitados.contains(s)) continue;
                int h = heuristica(s, problema.meta);
                if (h < mejorH) {
                    mejorH = h;
                    mejor = s;
                }
            }

            if (mejor == null) return null; // No hay mejor sucesor
            actual = mejor;
        }
    }

    private int heuristica(Estado e, Estado meta) {
        return Math.abs(e.x - meta.x) + Math.abs(e.y - meta.y);
    }
}
