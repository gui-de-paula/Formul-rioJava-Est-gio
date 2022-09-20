import java.util.Scanner;

public class Endereco {
    Scanner scanner = new Scanner(System.in);
    private String cidade;
    private String estado;
    private String setor;
    private String complemento;
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    private void editarCidade(){
        System.out.println("Digite a nova cidade");
        String novoCidade = scanner.nextLine();
        this.cidade = novoCidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    private void editaEstado(){
        System.out.println("Insira o novo Estado");
        String novoEstado = scanner.nextLine();
        this.estado = novoEstado;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void editarSetor(){
        System.out.println("Insira o novo Setor");
        String novoSetor = scanner.nextLine();
        this.setor = novoSetor;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public void editaComplemento(){
        System.out.println("Insira o novo Complemento");
        String novoComplemento = scanner.nextLine();
        this.complemento = novoComplemento;
    }

    public void editarEndereco(){
        boolean editarEndereco = true;

        do {
            System.out.println("***** Selecione a Opção que deseja *****" + "\n" +
                    "1 - Editar Cidade                       |" + "\n" +
                    "2 - Editar Estado                           |" + "\n" +
                    "3 - Editar Setor                        |" + "\n" +
                    "4 - Editar Complemento                      |" + "\n" +
                    "5 - Sair da Edição                          |");
            System.out.println("*******************************************");
            short escolhaEditaEnderco = scanner.nextShort();
            scanner.nextLine();

            switch (escolhaEditaEnderco) {
                case 1:
                    editarCidade();
                    break;

                case 2:
                    editaEstado();
                    break;

                case 3:
                    editarSetor();
                    break;

                case 4:
                    editaComplemento();
                    break;

                case 5:
                    editarEndereco = false;
                    break;

                default:
                    System.out.println("Opção inválida, por favor digite um opção válido");
                    break;

            }
        } while (editarEndereco);
    }
}
