public class Estado {
    int x, y;
    char tipo;

    public Estado(int x, int y, char tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public boolean esIgual(Estado otro) {
        return this.x == otro.x && this.y == otro.y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Estado)) return false;
        Estado otro = (Estado) obj;
        return x == otro.x && y == otro.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
