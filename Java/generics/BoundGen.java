
// We cannot bound the type we only use the extends using class or interfaces 
public class BoundGen<T extends Integer> {
    T a;
    T b;

    BoundGen(T a, T b) {
        this.a = a;
        this.b = b;
    }

    T multipy() {
        return this.a;
    }
}
