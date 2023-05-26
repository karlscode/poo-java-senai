
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Personagem dc = new Personagem();
        dc.setNome(teclado.nextLine());
        dc.setHabilidade(teclado.nextLine());
        
        Personagem marvel = new Personagem();
        marvel.setNome(teclado.nextLine());
        marvel.setHabilidade(teclado.nextLine());
        
        System.out.println("Personagem de DC");
        System.out.println("Nome: " + dc.getNome());
        System.out.println("Habilidade: " + dc.getHabilidade());
        
        System.out.println("Personagem de Marvel");
        System.out.println("Nome: " + marvel.getNome());
        System.out.println("Habilidade: " + marvel.getHabilidade());
    }
    
}
