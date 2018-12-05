/*
Autor: Ezequiel de Oliveira Sant'Ana

Criado em: 27/09/2018

O objetivo de criação do documento é o aprendizado e a pratica na linguagem JAVA.
A real função do código é executar dois codigos contidos no repositório.
Eles calculam a area de um determinado espaço e o preço para sua construção, respectivamente.

"Baseado no curso  Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman
Link de acesso: https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi "
*/

public class Projeto {
    static double area (double lateral, double cquarto, double raio){
        return(AreaCasa.Cabana(lateral, cquarto) + AreaPiscina.Piscina(raio));
    }

    public static void main (String[] args){
        AreaCasa casa1 = new AreaCasa(1500);
        AreaCasa casa2 = new AreaCasa(1270);


        System.out.println("Valor Casa1: " + casa1.valor(casa1.Cabana(15,10)));
        System.out.println("\nValor Casa2: " + casa2.valor(casa2.Cabana(18,8)));
    }
}
