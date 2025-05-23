import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {

    private static final Path CAMINHO_ARQUIVO = Paths.get("consumo.txt");

    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();
        double espacoTotal = 0;

        // Leitura e tratamento dos dados do arquivo
        try {
            // Mensagem de erro caso não ache o arquivo.
            if (!Files.exists(CAMINHO_ARQUIVO)) {
                System.out.println("Arquivo não existe!");
                return;
            }

            // Lista para armazenar as strings do arquivo.
            List<String> linhas = Files.readAllLines(CAMINHO_ARQUIVO);

            // Loop para percorrer as linhas do arquivo
            for (String linha : linhas) {
                String[] partes = linha.split(";");

                if (partes.length == 2) {
                    String usuarioNome = partes[0];
                    double espaco = Double.parseDouble(partes[1]);
                    usuarios.add(new Usuario(usuarioNome, espaco));
                    espacoTotal += espaco;
                }
            }

            // Ordenar os usuários pelo espaço ocupado em disco.
            usuarios.sort(Comparator.comparingDouble(Usuario::getEspaco).reversed());

            // Calcular espaço total em MB
            double espacoTotalMB = espacoTotal / (1024 * 1024);
            double espacoMedio = espacoTotal / usuarios.size(); // Cálculo da média

            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("Nr.\tUsuário\t\tEspaço utilizado\t\t% de uso");
            System.out.println("--------------------------------------------------------");

            // Exibir os dados dos usuários
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario usuario = usuarios.get(i);
                double espacoMB = usuario.getEspaco() / (1024 * 1024);
                double percentualUso = (espacoMB / espacoTotalMB) * 100;

                System.out.println(i + 1 + "\t" + usuario.getNome() + "\t" + df.format(espacoMB) + "MB \t\t"
                        + df.format(percentualUso) + "%");
            }

            // Espaço médio e espaço total
            System.out.println("\nEspaço médio por usuário: " + df.format(espacoMedio / (1024 * 1024)) + "MB");
            System.out.println("Espaço total em uso: " + df.format(espacoTotalMB));

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo!");
        }
    }
}
