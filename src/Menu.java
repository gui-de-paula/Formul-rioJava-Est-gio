import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cadastro> formularios = new ArrayList<>();
        int escolha, tamanho, a;
        short j, y = 0;
//        boolean newCadastro;
        System.out.println("                                   Seja bem vindo á central de formulário!!\n");
        do {
            System.out.println("________________________________________" + "\n" +
                    "|  ******** MENU INTERATIVO ********   |" + "\n" +
                    "|                                      |");
            System.out.println("|  Escolha uma das opções abaixo:      |" + "\n" +
                    "|                                      |");
            System.out.println("|  1- Cadastrar um formulário          |" + "\n" +
                    "|  2- Mostar formulários existentes    |" + "\n" +
                    "|  3- Excluir formulário               |" + "\n" +
                    "|  4- Editar formulário                |" + "\n" +
                    "|  5- Encerrar atendimento             |");
            System.out.println("|  \t Opção:                            |" + "\n" +
                    "|______________________________________|");

            escolha = scanner.nextInt();


            switch (escolha) {
                case 1:
                    Cadastro cadastro = new Cadastro();
                    cadastro.newform(y);
                    formularios.add(cadastro);
                    y++;
                    System.out.println("****Formulario cadastrado!!****\n");
                    break;
                case 2:
                    if (formularios.size() > 0) {
                        for (j = 0; j < formularios.size(); j++) {
                            formularios.get(j).mostraForm();
                        }
                    } else {
                        System.out.println("Não há formulário cadastrado!!\tPor favor cadastre um formulário");
                    }
                    break;

                case 3:
                    if (formularios.size() > 0) {
                        for (int i = 0; i < formularios.size(); i++) {
                            System.out.print((i + 1) + " - ");
                            formularios.get(i).mostraForm();
                            System.out.println("****Formulário excluido com sucesso!!****\n");
                        }
                        System.out.println("**** Digite o numero do formulario que deseja excluir" + "\n");
                        tamanho = formularios.size();
                        for (a = 0; a < tamanho; a++) {
                            System.out.println("Formulário " + (a + 1) + "\n");
                        }
                        short idFormulario = scanner.nextShort();
                        if (idFormulario <= tamanho && idFormulario > 0) {
                            formularios.remove((idFormulario - 1));
                        } else {
                            System.out.println("Formulário inexistente!!");
                        }
                    } else {
                        System.out.println("Não existem cadastros para serem excluídos");
                    }
                    break;

                case 4:
                    Cadastro editaCadastro = new Cadastro();
                    if (formularios.size() > 0) {
                        for (int i = 0; i < formularios.size(); i++) {
                            System.out.print("\n" + (i + 1) + " - ");
                            formularios.get(i).mostraForm();
                        }
                        System.out.println("**** Informe o número do Formulário que deseja Editar ****");
                        short idForm = scanner.nextShort();
                        if (idForm <= formularios.size() && idForm > 0) {
                            editaCadastro = formularios.get((idForm - 1));
                            editaCadastro.editarFormulario();
                            formularios.set((idForm - 1), editaCadastro);
                        } else {
                            do {
                                System.out.println("O formulário informado não existe!!" +
                                        "Por favor insira um numero válido: ");
                                idForm = scanner.nextShort();
                            } while (idForm > formularios.size() || idForm <= 0);
                        }
                    } else {
                        System.out.println("Não existem cadastros para serem Editados");
                    }
                    System.out.println(" ****Formulário editado com sucesso!!****\n");
                    break;

                case 5:
                    System.out.println("  \tAtendimento finalizado!!\n");
                    System.out.println("************** Muito Obrigado!! **************");
                    break;

                default:
                    System.out.println("Opção invalida!!\t Por favor insira uma opção valida\n");
            }

        } while (escolha != 5);
        scanner.close();
    }

}