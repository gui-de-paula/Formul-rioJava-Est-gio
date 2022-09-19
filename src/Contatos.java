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

     public String getEmailContato() {
          return emailContato;
     }

     public void setEmailContato(String emailContato) {
          this.emailContato = emailContato;
     }

     public String getTelefoneContato() {
          return telefoneContato;
     }

     public void setTelefoneContato(String telefoneContato) {
          this.telefoneContato = telefoneContato;
     }
     public String mostrarContatos() {
          return "-" + "Nome Contato: " + this.nomeContato + "\n" +
                  "-" + "E-mail Contato: " + this.emailContato + "\n" +
                  "-" + "Telefone Contato: " + this.telefoneContato;
     }
}
