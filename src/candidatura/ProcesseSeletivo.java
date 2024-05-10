package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcesseSeletivo {
  public static void main(String[] args) {
    //analisaCandidato(1900.50);
    //analisaCandidato(2320.23);
    //analisaCandidato(2000.00);
    selecaoCandidatos();
  }

  static void selecaoCandidatos(){
    String[] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","David"};
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.00;
    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();   
      
      System.out.println("O canditato "+ candidato + " solicitou o salario de R$ "+ salarioPretendido + ".");
      if(salarioPretendido <= salarioBase){
        System.out.println("O Candidato "+ candidato + " foi selecionado para a vaga!");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
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