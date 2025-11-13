public class App {
    public static void main(String[] args) throws Exception {
        Vettore<String> x = new Vettore();
        for (int i=0; i<50; i++)
            x.push("benni " + i);
        for (int i=0; i<50; i++)
            System.out.println(x.get(i));
    }
}
