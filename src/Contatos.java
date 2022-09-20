import java.util.Scanner;

public class Contatos {
     Scanner scanner = new Scanner(System.in);
     private String nomeContato;
     private String emailContato;
     private String telefoneContato;

     public String getNomeContato() {
          return nomeContato;
     }

     public void setNomeContato(String nomeContato) {
          this.nomeContato = nomeContato;
     }
     public void editarNomeContato() {
          System.out.println("Digite o novo nome do Contato: ");

          String novoNomeContato = scanner.nextLine();
          this.nomeContato = novoNomeContato;
     }

     public String getEmailContato() {
          return emailContato;
     }

     public void setEmailContato(String emailContato) {
          this.emailContato = emailContato;
     }
     public void editarEmailContato() {
          System.out.println("Digite o novo email do Contato: ");

          String novoEmailContato = scanner.nextLine();
          this.emailContato = novoEmailContato;
     }


     public String getTelefoneContato() {
          return telefoneContato;
     }

     public void setTelefoneContato(String telefoneContato) {
          this.telefoneContato = telefoneContato;
     }
     public void editarTelefoneContato() {
          System.out.println("Digite o novo telefone do Contato: ");

          String novoTelefoneContato = scanner.nextLine();
          this.telefoneContato = novoTelefoneContato;
     }

     public String mostrarContatos() {
          return "-" + "Nome Contato: " + this.nomeContato + "\n" +
                  "-" + "E-mail Contato: " + this.emailContato + "\n" +
                  "-" + "Telefone Contato: " + this.telefoneContato;
     }
     public void editarContatos(){
          boolean editarCont=true;
          do {
               System.out.println("     ***** Selecione a Opção que deseja *****" + "\n" +
                       "  |  1 - Editar Nome do contato                       |" + "\n" +
                       "  |  2 - Editar E-mail do contato                     |" + "\n" +
                       "  |  3 - Editar telefone do contato                   |" + "\n" +
                       "  |  4 - Sair da Edição  de contato                   |");
               System.out.println("   ************************************************");
               short opcaoEditaContato = scanner.nextShort();
               scanner.nextLine();

               switch (opcaoEditaContato) {
                    case 1:
                         editarNomeContato();
                         break;

                    case 2:
                         editarEmailContato();
                         break;

                    case 3:
                         editarTelefoneContato();
                         break;


                    case 4:
                         editarCont = false;
                         break;

                    default:
                         System.out.println("Opção inválida!!Por favor informe um opção válida.");
                         break;

               }
          } while (editarCont);
     }
  }

