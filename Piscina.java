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
public class Piscina {
    static final int matAlvenaria = 0;
    static final int matVinil = 1;
    static final int matFibra = 2;
    static final int matPlastico = 3;

    static double valorPiscina(double area, int material){
        double valor;
            switch (material){
                case matAlvenaria: valor = 1500;
                                        break;
                case matVinil: valor = 1100;
                                        break;
                case matFibra: valor = 750;
                                        break;
                case matPlastico: valor = 500;
                                        break;
                default: valor = -1;
    }
 }

public static void main(String[] args) {
    DecimalFormat dc = new DecimalFormat("0.00");
    double raio = 2;
    double areaPiscina;

    areap = Math.PI * Math.pow(raio,2);

    System.out.println("Area da Piscina: "+dc.format(areaPiscina));
    }
}
