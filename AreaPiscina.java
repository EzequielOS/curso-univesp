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

public class AreaPiscina {
    static final int matAlvenaria = 0;
    static final int matVinil = 1;
    static final int matFibra = 2;
    static final int matPlastico = 3;
    static double[] precos;

    static char[][] nomes = {{'A','l','v','e','n','a','r','i','a'},
        {'V','i','n','i','l'},
        {'F','i','b','r','a'},
        {'P','l','a','s','t','i','c','o'},
    };

    double raio;

    AreaPiscina(){
        double[] aux = {1500, 1100, 750, 500};
        this.precos = aux;
        this.raio = 10;
    }

    AreaPiscina(double[] precos){
        this.precos = precos;
        this.raio = 10;
    }

    AreaPiscina(double raio){
        this();
        this.raio = raio;
    }

    AreaPiscina(double[] precos, double raio){
        this.precos = precos;
        this.raio = raio;
    }

    double Piscina(){
        return((this.raio >= 0) ? Math.PI * Math.pow(this.raio,2) : -1);
    }


    static double valorPiscina(double area, int material) {

        if(material < matAlvenaria || material > matPlastico || area < 0) {
            return(-1);
        }
        return(area * precos[material]);
    }

    static void carregaValores(double[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 50; j <= 200; j += 50){
                m[i][j / 50 - 1] = valorPiscina (j,i);
            }
        }
    }

    static double[][] calculaFinal(double[][] val, double[][] desc){
        double[][] saida = new double[val.length] [val[0].length];
        for (int i = 0; i < saida.length; i++){
            for (int j = 0; j < saida[0].length; j++){
                saida[i][j] = val[i][j] * (1 - desc[i][j]);
            }
        }
        return(saida);
    }

    public static void main(String[]args) {

    }
}
