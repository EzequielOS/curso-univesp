/*
Autor: Ezequiel de Oliveira Sant'Ana

Criado em: 04/05/2018

O objetivo de criação do documento é o aprendizado e a pratica na linguagem JAVA.
A real função do código é executar dois codigos contidos no repositório.
Eles calculam a area de um determinado espaço e o preço para sua construção, respectivamente.

"Baseado no curso  Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman
Link de acesso: https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi "
*/

public class Projeto {
    static double area (AreaCasa casa, AreaPiscina piscina){
        return(casa.Cabana() + piscina.Piscina());
    }

    public static void main (String[] args){
        AreaCasa casa1 = new AreaCasa(10,5);
        AreaCasa casa2 = new AreaCasa(20,5);
        AreaPiscina piscina1 = new AreaPiscina(10);

        System.out.println(area(casa1, piscina1));
    }
}
