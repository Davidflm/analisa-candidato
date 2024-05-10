package candidatura;

public class ProcesseSeletivo {
  public static void main(String[] args) {
    analisaCandidato(1900.50);
    analisaCandidato(2320.23);
    analisaCandidato(2000.00);
  }
  static void analisaCandidato(double salarioPretendido){
    double salarioBase = 2000.00;
    
    if(salarioPretendido < salarioBase){
      System.out.println("LIGAR PARA O CANDIDATO");
    }else if(salarioPretendido == salarioBase){
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    }else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }
  
}