public class CasoTernario {
  public static void main(String[] args) {
     int nota = 7; // Exemplo de valor para a variável 'nota'
     
     // Corrigindo o operador ternário e atribuindo o resultado a uma String
     String resultado = nota >= 7 ? "Aprovado" : (nota >= 5 && nota < 7 ? "Prova de recuperação" : "Reprovado");
     
     // Exibindo o resultado
     System.out.println(resultado);
  }
}