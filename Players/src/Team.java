import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Team {
    private String _name;
    private ArrayList<Player> _players;

    public Team(String name) {
        _name = name;
        _players = new ArrayList<>();
    }

    public void add(Player player) {
        _players.add(player);
    }

    @Override
    public String toString() {
        String s = "Il team si chiama " + _name + " e i suoi giocatori sono:\n";
        for (Player i : _players) {
            s += i + "\n";
        }
        return s;
    }

    public void salvaTeam() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/team_"+_name));
            oos.writeObject(_players);
            oos.flush();
            oos.close();
        } catch ( IOException e ) {
            System.out.println("kill the developer");
        }
    }

    public void loadTeam(String name) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/team_"+name));
            _players = ((ArrayList<Player>)ois.readObject());
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }
}
