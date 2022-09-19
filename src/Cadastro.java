import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Contatos> contatos = new ArrayList<>();
    private InfoPessoais info;
    private Endereco endereco = new Endereco();
    public int id, escolhaContato;
    short i;

//    public InfoPessoais getInfo() {
//        return info;
//    }
//
//    public Acesso getAcesso() {
//        return acesso;
//    }
//
//    public void setAcesso(Acesso acesso) {
//        this.acesso = acesso;
//    }
//
//    public Endereco getEndereco() {
//        return endereco;
//    }

    public void newform(int id) {
        this.id = id;

        System.out.println("********* Informações pessoais *********");
        cadastrarInfoPessoais();
        System.out.println("********* Endereco *********");
        cadastrarEndereco();
        System.out.println("********* Contatos *********");
        cadastrarContatos();
        System.out.println("***************************************");
    }

    public void mostraForm() {
        System.out.println("********* FORMULÁRIO *********");
        System.out.println("\n\n********* Informações Pessoais *********" + "\n" +
                "- Nome: " + this.info.getNome() + "\n" +
                "- CPF: " + this.info.getCpf() + "\n" +
                "- Data: " + this.info.getData() + "\n" +
                "- Genero: " + this.info.getGenero() + "\n" +
                "- Escolaridade: " + this.info.getEscolaridade() + "\n" +
                "- ID: " + this.id + "\n");

        System.out.println("\n\n********* Endereço *********" + "\n" +
                "- Cidade: " + this.endereco.getCidade() + "\n" +
                "- Estado: " + this.endereco.getEstado() + "\n" +
                "- Setor:  " + this.endereco.getSetor() + "\n" +
                "- Complemento:  " + this.endereco.getComplemento());

        System.out.println("\n" + "\n********* Contatos *********" + "\n");
        for (int j = 0; j < contatos.size(); j++) {
            System.out.println("\n\t       Contato " + (j + 1) + "\n");
            System.out.println(contatos.get(j).mostrarContatos());
        }
    }

    public void cadastrarInfoPessoais() {

        this.info = new InfoPessoais();

        this.info.setNome(setInserir("Seu nome:", "nome"));
        this.info.setCpf(setInserir("Seu CPF:", "cpf"));
        this.info.setData(setInserir("Sua data de nascimento:", "data"));
        this.info.setEscolaridade(setInserir("Sua escolaridade:", "escolaridade"));
        this.info.setEmail(setInserir("Seu email:", "email"));

    }

    public void cadastrarEndereco() {
        this.endereco.setCidade(setInserir("Sua cidade:", "cidade"));
        this.endereco.setEstado(setInserir("Seu estado:", "estado"));
        this.endereco.setSetor(setInserir("Seu setor:", "setor"));
        this.endereco.setComplemento(setInserir("O complemento:", "complemento"));
    }

    public void cadastrarContatos() {

        for (int i = 0; i < 2; i++) {
            Contatos contatoExtra = new Contatos();
            contatoExtra.setNomeContato(setInserir("Nome do Contato", "nome"));
            contatoExtra.setEmailContato(setInserir("Email do Contato", "email"));
            contatoExtra.setTelefoneContato(setInserir("Telefone do Contato", "telefone"));
            contatos.add(contatoExtra);
            System.out.println("**** Contato Cadastrado com Sucesso ****");
            System.out.println("\nInsira mais um contato");

        }
        cadastrarNovoContato();
    }


    public void cadastrarNovoContato() {
        boolean newContato = true;

        do {
            System.out.println("|   ***** Selecione uma das opções abaixo *****    |" + "\n" +
                    "|    1 - Adicionar novo Contato                    |" + "\n" +
                    "|    2 - Mostrar Contatos existentes               |" + "\n" +
                    "|    3 - Excluir Contato existente                 |" + "\n" +
                    "|    4 - Finalizar cadastro de Contatos            |");
            System.out.println("|   ******************************************    |");

            escolhaContato = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaContato) {
                case 1:
                    Contatos outroContato = new Contatos();
                    outroContato.setNomeContato(setInserir("Nome do Contato", "nome"));
                    outroContato.setEmailContato(setInserir("Email do Contato", "email"));
                    outroContato.setTelefoneContato(setInserir("Telefone do Contato", "telefone"));
                    contatos.add(outroContato);
                    System.out.println("**** Contato Cadastrado com Sucesso ****");
                    break;

                case 2:
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println("*** Contato " + (i + 1) + " ****");
                        System.out.println(contatos.get(i).mostrarContatos());
                    }
                    System.out.println("*******************************************");
                    break;
                case 3:
                    for (int i = 0; i < contatos.size(); i++) {

                        System.out.println((i + 1) + " - " + contatos.get(i).mostrarContatos());
                    }
                    System.out.println("*** Digite o número do Contato que deseja Excluir ***");
                    short idContato = scanner.nextShort();
                    contatos.remove(idContato - 1);
                    System.out.println("**** Contato Removido com Sucesso ****");
                    break;

                case 4:
                    newContato = false;
                    break;

                default:
                    System.out.println("Valor inválido, por favor selecione uma opção válida");
            }

        } while (newContato);
    }

    //    public void editaCadastro() {
//
//        boolean editaCadastros = true;
//
//        System.out.println("***** EDIÇÃO DE CADASTRO *****");
//        do {
//            System.out.println("***** Selecione a Opção que deseja *****" + "\n" +
//                    "1 - Editar Dados Pessoais do Titular        |" + "\n" +
//                    "2 - Editar Endereço do Titular              |" + "\n" +
//                    "3 - Editar Contatos Alternativos            |" + "\n" +
//                    "4 - Sair da Edição                          |");
//            System.out.println("*******************************************");
//
//            short opcaoEditaCadastro = scanner.nextShort();
//
//            switch (opcaoEditaCadastro) {
//                case 1:
//                    this.info.editaPessoa();
//                    break;
//
//                case 2:
//                    this.endereco.editaEndereco();
//                    break;
//
//                case 3:
//                    cadastrarContatos();
//                    break;
//
//                case 4:
//                    editaCadastros = false;
//                    break;
//
//                default:
//                    System.out.println("Valor inválido, digite uma opção válida por favor");
//                    break;
//            }
//
//        } while (editaCadastros);
//
//    }
    public boolean isLetter(String campo) {
        String campoAux = campo.trim();
        campoAux = campoAux.toUpperCase();
        if (campoAux.matches("[A-Z]*")) {
            return true;
        }
        return false;
    }
    public String setInserir(String texto, String atributo) {
        String variavel;

        do {
            System.out.println("Digite " + texto);
            variavel = scanner.nextLine();
        } while (!validaCampoVazio(variavel));

        switch (atributo) {
            case "nome":
                if (isLetter(variavel)) {
                    break;
                } else {
                    while (!isLetter(variavel)) {
                        System.out.println("Digite um nome válido");
                        variavel = scanner.nextLine();

                    }return variavel;
                }

            case "cpf":
                if (validaCpf(variavel)) {
                    break;
                } else {
                    while (!validaCpf(variavel)) {
                        System.out.println("Digite um CPF válido");
                        variavel = scanner.nextLine();
                    }
                    ;
                    break;
                }

            case "email":
                if (validaEmail(variavel)) {
                    break;
                } else {
                    while (!validaEmail(variavel)) {
                        System.out.println("Digite um e-mail válido");
                        variavel = scanner.nextLine();
                    }
                }
                break;

            case "endereco":
                break;

            case "telefone":
                break;

        }

        return variavel;

    }

    public boolean validaCampoVazio(String campo) {
        String campoAux = campo.trim();

        if (campoAux.length() == 0) {
            System.out.println("Este campo não pode estar vazio");
            return false;
        } else {
            return true;
        }

    }

    public boolean validaCpf(String cpf) {
        cpf = cpf.replaceAll("\\.", "");
        cpf = cpf.replaceAll("-", "");

        if (cpf.length() != 11) {
            return false;
        } else {

            int[] numeros = new int[11];
            int resto1 = 0, resto2 = 0, soma1 = 0, soma2 = 0, igual = 0;

            for (int i = 0; i < cpf.length(); i++) {
                numeros[i] = Character.getNumericValue(cpf.charAt(i));
                if (i > 0) {
                    if (numeros[i - 1] == numeros[i]) {
                        igual++;
                    }
                }
            }

            if (igual >= 10) {
                return false;
            }

            for (int i = 0, j = 10; j >= 2; j--, i++) {
                soma1 += numeros[i] * j;
            }

            for (int i = 0, j = 11; j >= 2; j--, i++) {
                soma2 += numeros[i] * j;
            }

            resto1 = (soma1 * 10) % 11;
            resto2 = (soma2 * 10) % 11;

            if (resto1 != numeros[9] || resto2 != numeros[10]) {
                return false;
            }

            if (isLetter(cpf)) {
                return false;
            }
        }

        return true;
    }

    public boolean validaEmail(String email) {

        if (email.indexOf("@") == 0 && email.indexOf("@") != email.lastIndexOf("@")) {
            return false;
        }

        if (email.lastIndexOf(".") < email.indexOf("@")) {
            return false;
        }

        int indice = email.indexOf("@") + 1;
        if (email.charAt(indice) == '.') {
            return false;
        }

        return true;
    }
//    public String setInserir(String text, String atributo) {
//        String x;
//
//        switch (atributo) {
//            case "nome":
//                x = scanner.nextLine();
//                if (!validaCampoVazio(x)) {
//                    if (x.matches("[a-zA-Z]")) {
//                        System.out.println("Digite um nome válido");
//                        x = scanner.nextLine();
//                    } else
//                        return x;
//                } else {
//                    System.out.println("Digite o nome");
//                    return x;
//                }
//
//            case "cpf":
//                x = scanner.nextLine();
//                while (!validaCpf(x)) {
//                    System.out.println("Digite um CPF válido");
//                    x = scanner.nextLine();
//                    return x;
//                }
//
//
//            case "endereco":
//                x = scanner.nextLine();
//                return x;
//
//            case "telefone":
//                x = scanner.nextLine();
//                return x;
//
//            case "email":
//                x = scanner.nextLine();
//                if (validaEmail(x)) {
//                    return x;
//                } else {
//                    while (!validaEmail(x)) {
//                        System.out.println("Digite um e-mail válido");
//                        x = scanner.nextLine();
//                        return x;
//                    }
//                }
//        }
//    }
//
//
//    public boolean validaCampoVazio(String campo) {
//        String campoAux = campo.trim();
//
//        if (campoAux.length() == 0) {
//            System.out.println("Este campo não pode estar vazio");
//            return false;
//        } else {
//            return true;
//        }
//
//    }
//
//    public boolean validaCpf(String cpf) {
//        cpf = cpf.replaceAll("\\.", "");
//        cpf = cpf.replaceAll("-", "");
//
//        if (cpf.length() != 11) {
//            return false;
//        } else {
//
//            int[] numeros = new int[11];
//            int resto1 = 0, resto2 = 0, soma1 = 0, soma2 = 0, igual = 0;
//
//            for (int i = 0; i < cpf.length(); i++) {
//                numeros[i] = Character.getNumericValue(cpf.charAt(i));
//                if (i > 0) {
//                    if (numeros[i - 1] == numeros[i]) {
//                        igual++;
//                    }
//                }
//            }
//
//            if (igual >= 10) {
//                return false;
//            }
//
//            for (int i = 0, j = 10; j >= 2; j--, i++) {
//                soma1 += numeros[i] * j;
//            }
//
//            for (int i = 0, j = 11; j >= 2; j--, i++) {
//                soma2 += numeros[i] * j;
//            }
//
//            resto1 = (soma1 * 10) % 11;
//            resto2 = (soma2 * 10) % 11;
//
//            if (resto1 != numeros[9] || resto2 != numeros[10]) {
//                return false;
//            }
//
////            if (isLetter(cpf)) {
////                return false;
////            }
//        }
//
//        return true;
//    }
//
//    public boolean validaEmail(String email) {
//
//        if (email.indexOf("@") == 0 && email.indexOf("@") != email.lastIndexOf("@")) {
//            return false;
//        }
//
//        if (email.lastIndexOf(".") < email.indexOf("@")) {
//            return false;
//        }
//
//        int indice = email.indexOf("@") + 1;
//        if (email.charAt(indice) == '.') {
//            return false;
//        }
//
//        return true;
//    }
//    public static String isCPF(String cpfAux) {
//        // considera-se erro CPF's formados por uma sequencia de numeros iguais
//        if (cpfAux.equals("00000000000") ||
//                cpfAux.equals("11111111111") ||
//                cpfAux.equals("22222222222") || cpfAux.equals("33333333333") ||
//                cpfAux.equals("44444444444") || cpfAux.equals("55555555555") ||
//                cpfAux.equals("66666666666") || cpfAux.equals("77777777777") ||
//                cpfAux.equals("88888888888") || cpfAux.equals("99999999999") ||
//                (cpfAux.length() != 11))
//            return("false");
//
//        char dig10, dig11;
//        int sm, i, r, num, peso;
//
//        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
//        try {
//            // Calculo do 1o. Digito Verificador
//            sm = 0;
//            peso = 10;
//            for (i=0; i<9; i++) {
//                // converte o i-esimo caractere do CPF em um numero:
//                // por exemplo, transforma o caractere '0' no inteiro 0
//                // (48 eh a posicao de '0' na tabela ASCII)
//                num = (int)(cpfAux.charAt(i) - 48);
//                sm = sm + (num * peso);
//                peso = peso - 1;
//            }
//
//            r = 11 - (sm % 11);
//            if ((r == 10) || (r == 11))
//                dig10 = '0';
//            else dig10 = (char)(r + 48); // converte no respectivo caractere numerico
//
//            // Calculo do 2o. Digito Verificador
//            sm = 0;
//            peso = 11;
//            for(i=0; i<10; i++) {
//                num = (int)(cpfAux.charAt(i) - 48);
//                sm = sm + (num * peso);
//                peso = peso - 1;
//            }
//
//            r = 11 - (sm % 11);
//            if ((r == 10) || (r == 11))
//                dig11 = '0';
//            else dig11 = (char)(r + 48);
//
//            // Verifica se os digitos calculados conferem com os digitos informados.
//            if ((dig10 == cpfAux.charAt(9)) && (dig11 == cpfAux.charAt(10)))
//                return("true");
//            else return("false");
//        } catch (InputMismatchException erro) {
//            return("false");
//        }
//    }

    public static String printCPF(String cpfAux) {
        return (cpfAux.substring(0, 3) + "." + cpfAux.substring(3, 6) + "." +
                cpfAux.substring(6, 9) + "-" + cpfAux.substring(9, 11));
    }
}
