import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Player {
    private String _nome;
    private int _valore;

    public Player(String nome, int valore) {
        _nome = nome;
        _valore = valore;
    }

    public String toString() {
        return "Player [name="+_nome+", value="+Integer.toString(_valore)+"]";
    }

    public void setValore(int valore) {
        _valore = valore;
    }

    public void salva() {
        File f = new File("data/" + _nome + ".txt");
        try (PrintWriter bw = new PrintWriter(new FileWriter(f))) {
            bw.print(_valore);
        } catch (IOException e) {
            System.out.println("kill the developer");
        }
    }

    public void load() {
        File f = new File("data/" + _nome + ".txt");     
        try (Scanner s = new Scanner(new FileReader(f))) {
            _valore = s.nextInt();
        } catch (IOException e) {
            System.out.println("file non trovato");
        }
    }
}