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
    double valorM2 = 1500;
    double lateral = 10;
    double cquarto = 10;

    AreaCasa(){

    }
    AreaCasa(double valorM2){
        this.valorM2 = valorM2;
    }
    AreaCasa(double lateral, double cquarto){
        this.lateral = lateral;
        this.cquarto = cquarto;
    }
    AreaCasa(double lateral, double cquarto, double valorM2){
        this(lateral, cquarto);
        this.valorM2 = valorM2;
    }

    double Cabana () {
        double areaTotal = -1;
        if (this.lateral >= 0 && this.cquarto >= 0){
            areaTotal = this.lateral * this.lateral;
            areaTotal = this.cquarto * this.lateral;
        }
        return (areaTotal);
    }


    double valor(double area) {
        if (area >= 0){
            return (this.valorM2 * area);
        }
        return (-1);
    }


    public static void main(String[]args) {

    }
}
