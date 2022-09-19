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
    private void editaCidade(){
        System.out.println("Digite a nova cidade");
        String city = scanner.nextLine();
        this.cidade = city;
    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    private void editaEstado(){
        System.out.println("Insira o novo Estado");
        String state = scanner.nextLine();
        this.estado = state;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    private void editaSetor(){
        System.out.println("Insira o novo Setor");
        String setorNovo = scanner.nextLine();
        this.setor = setorNovo;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    private void editaComplemento(){
        System.out.println("Insira o novo Complemento");
        String complement = scanner.nextLine();
        this.complemento = complement;
    }
    public void editaEndereco(){
        boolean editaEndereco = true;

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
                    editaCidade();
                    break;

                case 2:
                    editaEstado();
                    break;

                case 3:
                    editaSetor();
                    break;

                case 4:
                    editaComplemento();
                    break;

                case 5:
                    editaEndereco = false;
                    break;

                default:
                    System.out.println("Opção inválida, por favor digite um opção válido");
                    break;

            }
        } while (editaEndereco);
    }

}
