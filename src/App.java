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
    

        switch (buton) {
            case 1:
                System.out.println("Escolha o arquivo para testar:");
                System.out.println("0 - toy.txt");
                System.out.println("1 - rg300_4730.txt");
                System.out.println("2 - rome99c.txt");
                System.out.println("3 - facebook_combined.txt");
                System.out.println("4 - USA-road-dt.DC.txt");
                System.out.println("5 - USA-road-dt.NY.txt");
                int file = sc.nextInt();

                System.out.println("Insira a origem:");
                int s = sc.nextInt();
                System.out.println("Insira o destino:");
                int d = sc.nextInt();

                GraphList g1 = new GraphList(arquivos[file]);
                GraphMatrix g2 = new GraphMatrix(arquivos[file]);

                System.out.println();
                System.out.println("[Dijkstra]");
                System.out.println();
                long startTime = System.currentTimeMillis();
                g1.dijkstra(s, d);
                float totalTime = System.currentTimeMillis() - startTime;
                System.out.println("O tempo total foi de " + totalTime / 1000 + " segundos.");

                System.out.println();
                System.out.println("[Bellman Ford]");
                System.out.println();
                startTime = System.currentTimeMillis();
                g1.bellmanFord(s, d);
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("O tempo total foi de " + totalTime / 1000 + " segundos.");

                System.out.println();
                System.out.println("[Bellman Ford Melhorado]");
                System.out.println();
                startTime = System.currentTimeMillis();
                g1.bellmanFordMelhorado(s, d);
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("O tempo total foi de " + totalTime / 1000 + " segundos.");

                System.out.println();
                System.out.println("[Floyd Warshall]");
                System.out.println();
                startTime = System.currentTimeMillis();
                g2.floydWarshall(s, d);
                totalTime = System.currentTimeMillis() - startTime;
                System.out.println("O tempo total foi de " + totalTime / 1000 + " segundos.");
                break;

            case 2:
                System.out.println("Informe o nome do arquivo:(Exemplo: files/maze/toy.txt)");
                String filename = sc.next();
                long startTimeLabirinto = System.currentTimeMillis();
                Labirinto labirinto = new Labirinto(filename);
                float totalTimeLabirinto = System.currentTimeMillis() - startTimeLabirinto;
                System.out.println("O tempo total foi de " + totalTimeLabirinto / 1000 + " segundos.");

                break;
            case 3:
                break;

            default:
                System.out.println("Opcao invalida!");
        }

    }

    sc.close();
       
}
