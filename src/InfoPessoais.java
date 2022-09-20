import java.util.Scanner;

public class InfoPessoais {
    Scanner scanner = new Scanner(System.in);
    private String nome;
    private String cpf;
    private String data;
    private String escolaridade;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void editarNome() {
        String nome;
        System.out.println("Digite o novo nome:");
        nome = scanner.nextLine();
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void editarEmail() {
        System.out.println("Digite o novo e-mail: ");

        String email = scanner.nextLine();
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void editarCPF() {
        System.out.println("Digite o novo CPF: ");

        String cpf = scanner.nextLine();
        this.cpf= cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void editarData() {
        System.out.println("Digite a nova data de nascimento: ");

        String data = scanner.nextLine();
        this.data = email;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }
    public void editarEscolaridade() {
        System.out.println("Digite a nova escolaridade: ");

        String escolaridade = scanner.nextLine();
        this.escolaridade = escolaridade;
    }
    public void editarInfo() {
        boolean editarDadosInfo = true;

        do {
            System.out.println("          ***** Selecione a Opção que deseja *****" + "\n" +
                    "  |  1 - Editar Nome                 |" + "\n" +
                    "  |  2 - Editar E-mail               |" + "\n" +
                    "  |  3 - Editar CPF                  |" + "\n" +
                    "  |  4 - Editar Data de nascimento   |" + "\n" +
                    "  |  5 - Editar escolaridade         |" + "\n" +
                    "  |  6 - Sair da Edição                   |");
            System.out.println("*******************************************");
            short opcaoEditaInfo = scanner.nextShort();
            scanner.nextLine();

            switch (opcaoEditaInfo) {
                case 1:
                    editarNome();
                    break;

                case 2:
                    editarEmail();
                    break;

                case 3:
                    editarCPF();
                    break;

                case 4:
                    editarData();
                    break;

                case 5:
                    editarEscolaridade();
                    break;
                case 6:
                    editarDadosInfo = false;
                    break;

                default:
                    System.out.println("Opção inválida!!Por favor informe um opção válida.");
                    break;

            }
        } while (editarDadosInfo);
    }
}