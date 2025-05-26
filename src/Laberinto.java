public class Laberinto extends Problema {
    public Laberinto() {
        super();
        char[][] mundo = {
                {'G', 'E', 'E', 'E'},
                {'E', 'E', 'P', 'W'},
                {'E', 'E', 'E', 'E'},
                {'W', 'E', 'E', 'I'}
        };

        Estado inicio = new Estado(3, 3, 'I');
        Estado meta = new Estado(0, 0, 'G');

        super.inicial = inicio;
        super.meta = meta;
        super.mundo = mundo;
    }

    public Laberinto(Estado inicial, Estado meta, char[][] mundo) {
        super(inicial, meta, mundo);
    }
}
