import java.util.Scanner;
public class ControledeFluxo {

 double saldo = 0.0;
 double valorSolicitado = 0.0;

    public static void main(String[] args) {
      ControledeFluxo cFluxo = new ControledeFluxo();
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Digite o valor do seu salo : ");
      cFluxo.saldo = scan.nextDouble();

      System.out.println("Digite o Valor para retirada : ");
      cFluxo.valorSolicitado = scan.nextDouble();

      if (cFluxo.valorSolicitado < cFluxo.saldo) {
         cFluxo.saldo = cFluxo.saldo - cFluxo.valorSolicitado;
        System.out.println("Retirada realizada com sucesso :"+ cFluxo.saldo);
      }else{
        System.out.println("Saldo Insuficiente,seu saldo atual é "+cFluxo.saldo);
      }


    }
}