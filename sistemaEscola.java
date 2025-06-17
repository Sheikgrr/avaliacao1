import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[8];
        double[] mediasBimestrais = new double[4];

        System.out.println("=== SISTEMA ESCOLAR ===");
        System.out.println("Informe as 8 notas anuais do aluno:");

        // Recebendo as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }

        // Cálculo das médias bimestrais
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        double mediaSemestre1 = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        double mediaSemestre2 = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Cálculo da média final
        double mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Apresentação clara dos resultados
        System.out.println("\n=== RESULTADOS ===");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Média do %dº bimestre: %.2f\n", i + 1, mediasBimestrais[i]);
        }

        System.out.printf("\nMédia do 1º semestre: %.2f\n", mediaSemestre1);
        System.out.printf("Média do 2º semestre: %.2f\n", mediaSemestre2);
        System.out.printf("\nMÉDIA FINAL DO ANO: %.2f\n", mediaFinal);

        input.close();
    }
}