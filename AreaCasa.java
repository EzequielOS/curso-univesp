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

        if (lateral<0){
            System.out.println("Erro:lateral da sala menor que 0");
        }else {
            if (cquarto<0)
            System.out.println("Erro:lateral da quarto menor que 0");
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

    static final int matAlvenaria = 0;
    static final int matVinil = 1;
    static final int matFibra = 2;
    static final int matPlastico = 3;
    static double[] matPrecos = {1500, 1100, 750, 500};

    static char[][] nomes = {{'A','l','v','e','n','a','r','i','a'},
        {'V','i','n','i','l'},
        {'F','i','b','r','a'},
        {'P','l','a','s','t','i','c','o'},
    };

    static double Piscina(double raio){ //variavel declarada no parametro
        if (raio >= 0){
            return Math.PI * Math.pow(raio,2);
        } else {
            return(-1);
        }
    }

    static double valorPiscina(double area, int material) {

        if(material < matAlvenaria || material > matPlastico || area < 0) {
            return(-1);
        }
        return(area * matPrecos[material]);
    }

    static double valor(double area) {
        if (area >= 0)
            return (valorM2 * area);
        return (-1);
    }

    static double media(double[] arranjo){

        double calcMedia = 0;

        for(double valor : arranjo) {
            calcMedia += valor;
        }
        return (calcMedia / arranjo.length);
    }
    public static void carregaValores(double[][] m){
        for (int i = 0; i < m.length; i++){
            for (int j = 50; j <= 200; j += 50){
                m[i][j / 50 - 1] = valorPiscina (j,i);
            }
        }
    }
    public static double[][] calculaFinal(double[][] val, double[][] desc){
        double[][] saida = new double[val.length] [val[0].length];
        for (int i = 0; i < saida.length; i++){
            for (int j = 0; j < saida[0].length; j++){
                saida[i][j] = val[i][j] * (1 - desc[i][j]);
            }
        }
        return(saida);
    }
    public static double[][] somaMatriz(double[][] a, double[][] b){
        if (a.length != b.length || a[0].length != b[0].length){
            return null;
        }else {
            double[][] res = new double[a.length][a[0].length];
            for (int i = 0; i < res.length; i++){
                for(int j = 0; j < res[0].length; j++){
                    res[i][j] = a[i][j] + b[i][j];
                }
            }
            return res;
        }
    }
    static void imprimeMatriz(double[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("\t" + matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] subtraiMatriz(double[][] a, double[][] b){
        if (a.length != b.length || a[0].length != b[0].length){
            return null;
        }else {
            double[][] res = new double[a.length][a[0].length];
            for (int i = 0; i < res.length; i++){
                for(int j = 0; j < res[0].length; j++){
                    res[i][j] = a[i][j] - b[i][j];
                }
            }
            return res;
        }
    }
    static double[][] transporMatriz(double[][] m){
        double[][] transp = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                transp[j][i] = m[i][j];
            }
        }
        return transp;
    }

    public static void main(String[]args) {
        double areaPiscina;
        DecimalFormat dc = new DecimalFormat("0.00");

        Cabana(11,7);

        areaPiscina = Piscina(2);

        System.out.println("Area da Piscina: "+dc.format(areaPiscina));

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

        System.out.print("\tValores para construir piscina\n");
        System.out.print("Eixo X: 50 | 100 | 150 | 200 | m2\n");
        System.out.print("Eixo Y: Alvenaria|Vinil|Plastico|Fibra\n");

        double valores[][] = new double[4][4];
        carregaValores(valores);
        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){
                System.out.print("\t" + valores[i][j] + " ");
            }
            System.out.println();
        }

        double descontos[][] = {{0,0,0.2,0.2},
            {0.05,0.05,0.1,0.15},
            {0.02,0.04,0.08,0.16},
            {0,0,0,0.05}
        };

        System.out.println("\tValores COM DESCONTOS");

        double[][] pFinal;
        pFinal = calculaFinal(valores, descontos);
        imprimeMatriz(pFinal);

        System.out.println("\tValores SOMADOS");
        imprimeMatriz(somaMatriz(pFinal, pFinal));

        System.out.println("\tValores SUBTRAIDOS");
        imprimeMatriz(subtraiMatriz(pFinal, pFinal));

        System.out.println("\tValores TRANSPOSTOS");
        imprimeMatriz(transporMatriz(pFinal));
    }
}
