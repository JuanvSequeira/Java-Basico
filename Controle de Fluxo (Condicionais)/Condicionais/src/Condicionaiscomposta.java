import java.util.Scanner;
public class Condicionaiscomposta {

 int nota = 00;
 int media = 6;

    public static void main(String[] args) {
      Condicionaiscomposta cNotas = new Condicionaiscomposta();
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Digite a sua nota : ");
      cNotas.nota = scan.nextInt();

     
      if (cNotas.nota >= cNotas.media) {
        
        System.out.println("Aprovado com sucesso : "+ cNotas.nota);
      }else if (cNotas.nota >= 5 && cNotas.media  < 7){
        System.out.println("Prova de recuperação");
      }else if (cNotas.nota > 5 && cNotas.nota  < 7){
        System.out.println("Prova de recuperação");
      }else{
        System.out.println("Reprovado "+cNotas.nota);
      }


    }
}
