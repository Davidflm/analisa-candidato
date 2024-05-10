package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcesseSeletivo {
  public static void main(String[] args) {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto"};
    // analisaCandidato(1900.50);
    // analisaCandidato(2320.23);
    // analisaCandidato(2000.00);
    //selecaoCandidatos();
    //imprimeSelecionados();
    for(String candidato : candidatos){
      entrandoEmContato(candidato);
    }
  }
  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;
    do{
      atendeu = atender();
      continuarTentando = !atendeu;
      if(continuarTentando){
        tentativasRealizadas++;
      }else{
        System.out.println("CONTATO REALIZADO COM SUCESSO");
      }

    }while(continuarTentando && tentativasRealizadas < 3);
    if(atendeu){
      System.out.println("Conseguimos contato com o "+ candidato + " na " + tentativasRealizadas + " tentativas.");
    }else{
      System.out.println("Nao conseguimos contato com o " + candidato +". Numero maximo de tentativas "+ tentativasRealizadas + ".");
    }
  }

  //auxiliar method
  static boolean atender(){
    return new Random().nextInt(3)==1;
  }

  static void imprimeSelecionados() {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica" };
    System.out.println("Imprimindo lista de candidatos informando a colocação");
    // using FOR
    for (int i = 0; i < candidatos.length; i++) {
      System.out.println("O candidato de nº " + (i + 1) + " é o " + candidatos[i]);
    }
    System.out.println("Impriminto a Lista abreviada");
    // using FOR EACH
    for(String candidato : candidatos){
      System.out.println("O candidato selecionado foi " + candidato);
    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela",
        "David" };
    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.00;
    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O canditato " + candidato + " solicitou o salario de R$ " + salarioPretendido + ".");
      if (salarioPretendido <= salarioBase) {
        System.out.println("O Candidato " + candidato + " foi selecionado para a vaga!");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisaCandidato(double salarioPretendido) {
    double salarioBase = 2000.00;

    if (salarioPretendido < salarioBase) {
      System.out.println("LIGAR PARA O CANDIDATO");
    } else if (salarioPretendido == salarioBase) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
  }

}