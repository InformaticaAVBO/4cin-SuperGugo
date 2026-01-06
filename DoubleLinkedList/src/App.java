public class App {
    public static void main(String[] args) throws Exception {
        List<String> lista = new List<>();
        lista.add_tail("giacomo");
        lista.add_tail("franco");
        lista.add_head("andrea");
        lista.splice(1);
        lista.insert(1, "martino");
        System.out.println(lista.get(2));
        System.out.println(lista);
    }
}
