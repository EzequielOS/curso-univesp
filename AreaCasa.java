/*
        Autor: Ezequiel de Oliveira Sant'Ana

        Criado em: 27/09/2018

        O objetivo de criação do documento é o aprendizado e a pratica na linguagem JAVA.
        A real função do código é calcular a area de um determinado espaço e o preço para sua construção, respectivamente.

"Baseado no curso  Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
              Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman
        Link de acesso: https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi "
*/

import java.text.DecimalFormat;
    public class AreaCasa {
        static double valorM2 = 1500;
        static void Cabana(float lateral, float cquarto) {
            float areaQuarto;
            float areaSala;
            float areaTotal;

          if (lateral<0) 
              System.out.println("Erro:lateral da sala menor que 0");
          else {
              if (cquarto<0) System.out.println("Erro:lateral da quarto menor que 0");
                  else{
                      areaSala = lateral * lateral;
                      areaQuarto = cquarto * (lateral/2);
                      areaTotal = areaSala + 2 * areaQuarto;

                      System.out.println("Programa Para o Calculo da area da Casa");
                      System.out.println("A area da sala equivale: "+areaSala);
                      System.out.println("A area do quarto equivale: "+areaQuarto);
                      System.out.println("A area do banheiro equivale: "+areaQuarto);
                      System.out.println("A area total equivale: "+areaTotal);
        }
    }
}

static double Piscina(double raio){ //variavel declarada no parametro
    if (raio >= 0)
        return Math.PI * Math.pow(raio,2);
    else return(-1);
}

public static void main(String[]args) {
  double areaPiscina; DecimalFormat dc = new DecimalFormat("0.00");
    Cabana(11,7);
    areaPiscina = Piscina(2);
    System.out.println("Area da Piscina: "+dc.format(areaPiscina));

double precoConstrucao;
boolean valorOK = false;
precoConstrucao = valor(20);
valorOK = precoConstrucao >= 0;

System.out.print("Valor para construir ");
if(valorOK)System.out.println("equivalente:"+precoConstrucao);
else System.out.println("nao foi obtido: AREA NEGATIVA!!!");
}

static double valor(double area){
  if (area >= 0) return(valorM2 * area);
    return (-1);
  }
}
