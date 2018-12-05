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
    static double valorM2;

    AreaCasa(){
        this(1500.0);
    }
    AreaCasa(double valorM2){
        this.valorM2 = valorM2;
    }

    static double Cabana (double lateral, double cquarto) {
        double areaTotal = -1;
        if (lateral >=0 && cquarto >= 0){
            areaTotal = lateral * lateral;
            areaTotal = cquarto * lateral;
        }
        return (areaTotal);
    }


    static double valor(double area) {
        if (area >= 0)
            return (valorM2 * area);
        return (-1);
    }


    public static void main(String[]args) {
        DecimalFormat dc = new DecimalFormat("0.00");

        Cabana (11,7);

        double precoConstrucao;
        boolean valorOK = false;

        precoConstrucao = valor(20);
        valorOK = precoConstrucao >= 0;

        System.out.print("Valor para construir ");

        if(valorOK){
            System.out.println("equivalente:"+precoConstrucao);
        } else {
            System.out.println("nao foi obtido: AREA NEGATIVA!!!");
        }
    }
}
