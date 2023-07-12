
public class Main {
    public static void main(String[] args) {
        General<String> name = new General<String>("Krushna");
        System.out.println("Put String value: " + name.getName());
        General<Integer> val = new General<Integer>(10);
        System.out.println("Put Intger value: " + val.getName());
        General<Double> value = new General<Double>(10.0);
        System.out.println("Put Double value: " + value.getName());
        BoundGen<Integer> num = new BoundGen<Integer>(10, 30);
        Integer a = 100;
        System.out.println(num.multipy() + a);
    }
}
