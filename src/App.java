import java.io.IOException;
import java.util.Scanner;

class App {
    public static void main(String[] args) throws IOException {
        String arquivos[] = new String[6];
        
        arquivos[0] = "files/cm/toy.txt";
        arquivos[1] = "files/cm/rg300_4730.txt";
        arquivos[2] = "files/cm/rome99c.txt";
        arquivos[3] = "files/cm/facebook_combined.txt";
        arquivos[4] = "files/cm/USA-road-dt.DC.txt";
        arquivos[5] = "files/cm/USA-road-dt.NY.txt";

        Scanner sc = new Scanner(System.in);

        int buton = 0;

        while (buton != 3) {
            System.out.println();
            System.out.println("Informe a tarefa:");
            System.out.println("1- Caminho Minimo");
            System.out.println("2- Labirinto");
            System.out.println("3- Sair");
            buton = sc.nextInt();

          
                

        sc.close();
        }
}
}