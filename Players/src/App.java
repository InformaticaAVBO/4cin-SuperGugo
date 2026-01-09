public class App {
    public static void main(String[] args) throws Exception {
        Player p = new Player("totti", 2147483647 );
        Player p2 = new Player("a", 3 );
        p2.load();
        Team t1 = new Team("spica");
        t1.add(p);
        t1.add(p2);
        System.out.println(t1);
        t1.salvaTeam();
        Team t2 = new Team("rigil");
        t2.loadTeam("spica");
    }
}
