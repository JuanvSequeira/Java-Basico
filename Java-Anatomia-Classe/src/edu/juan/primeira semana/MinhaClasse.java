public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Juan";
    String segundoNome ="Victor";

    String NomeCompleto = NomeCompleto( primeiroNome, segundoNome);
      
    System.out.println(NomeCompleto);
    
    
  }
  public static String NomeCompleto (String primeiroNome,String segundoNome){
    return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);
  }

}

