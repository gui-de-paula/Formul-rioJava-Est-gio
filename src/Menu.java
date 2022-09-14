import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayList<Cadastros> formularios = new ArrayList<>();
        int escolha, novaEscolha;
        short j;
        System.out.println("Seja bem vindo á central de formulário!!\n");
        do {

            System.out.println("************ MENU INTERATIVO ************\n");
            System.out.println("Escolha uma das opções abaixo:\n");
            System.out.println("1- Cadastrar um formulário" + "\n" +
                    "2- Mostar formulários existentes" + "\n" +
                    "3- Editar formulário" + "\n" +
                    "4- Excluir formulário" + "\n" +
                    "5- Encerrar atendimento");
            System.out.println("\tOpção: ");

             escolha = scanner.nextInt();


            switch (escolha) {
                case 1:

                    System.out.println("****Formulario cadastrado!!****\n");
                    break;
                case 2:
//            if(formularios.size()>0){
//                for(j=0;j<formularios.size();j++){
//                    formularios.get(j).mostrarCadastro();
//                }
//            }
//            else{
//                do {
//                    System.out.println("Não há formulário cadastrado!!\tPor favor cadastre um formulário");
//                    System.out.println(("\n************ MENU INTERATIVO ************\n"));
//                    System.out.println("Escolha uma opção: " + "\n" +
//                            "1- Cadastrar um formulário" + "\n" +
//                            "2-Encerrar atendimento");
//                    novaEscolha = scanner.nextInt();
//                    switch (novaEscolha) {
//                        case 1:
//
//                            break;
//                        case 2:
//                            System.out.println("Atendimento finalizado!!");
//                           3 System.out.println("************** Muito Obrigado!! **************");
//                            escolha=5;
//                            break;
//                        default:
//                            System.out.println("Opção invalida!!");
//                    }
//                }while(novaEscolha<1 || novaEscolha>2);
//            }
                        break;

                case 3:
                    System.out.println("****Formulário editado com sucesso!!****\n");
                    break;

                case 4:
                    System.out.println("****Formulário excluido com sucesso!!****\n");
                    break;

                case 5:
                    System.out.println("\tAtendimento finalizado!!\n");
                    System.out.println("************** Muito Obrigado!! **************");
                    break;

                default:
                    System.out.println("Opção invalida!!\t Por favor insira uma opção valida\n");
          }

        }while (escolha !=5);
        scanner.close();
    }

}