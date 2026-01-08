import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Player {
    private String _nome;
    private int _valore;

    public Player(String nome, int valore) {
        _nome = nome;
        _valore = valore;
    }

    public void salva() {
        File f = new File("data/" + _nome + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
            bw.write(Integer.toString(_valore));
        } catch (IOException e) {
            System.out.println("kill the developer");
        }
    }
}