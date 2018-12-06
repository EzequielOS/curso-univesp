/*
Autor: Ezequiel de Oliveira Sant'Ana

Criado em: 04/12/2018

O objetivo de criação do documento é o aprendizado e a pratica na linguagem JAVA.
A real função do código é executar dois codigos contidos no repositório.
Eles calculam a area de um determinado espaço e o preço para sua construção, respectivamente.

"Baseado no curso  Programação de Computadores da  Univesp - Universidade Virtual do Estado de São Paulo.
Professores responsáveis: Luciano Digiampietri e Norton Trevisan Roman
Link de acesso: https://www.youtube.com/playlist?list=PLxI8Can9yAHfK6wdaMUO74lmotAP7J7bi "
*/

public class Projeto {
    Residencia[] condominio;
    int ultimo = -1; //ultimo alocado

    boolean adicionaRes(Residencia r){
        if(this.ultimo < this.condominio.length - 1){
            ultimo++;
            this.condominio[ultimo] = r;
            return(true);
        }
        return(false);
    }

    Projeto(int tam){
        condominio = new Residencia[tam];
    }

    public static void main (String[] args){
        Projeto proj = new Projeto(3);

        AreaCasa c = new AreaCasa(10,5);
        AreaPiscina p = new AreaPiscina(5);
        Residencia r = new Residencia(c,p);
        proj.adicionaRes(r);

        c = new AreaCasa(12,7);
        p = new AreaPiscina(6);
        r = new Residencia(c, p);
        proj.adicionaRes(r);

        c = new AreaCasa(10,6);
        p = new AreaPiscina(3.5);
        r = new Residencia(c, p);
        proj.adicionaRes(r);

        System.out.println("Tamanho da Casa1 (10x5) Piscina (5): " + proj.condominio[0].casa.Cabana() + "m2");
        System.out.println("Tamanho da Casa2 (12x7) Piscina (6): " + proj.condominio[1].casa.Cabana() + "m2");
        System.out.println("Tamanho da Casa3 (10x6) Piscina (3.5): " + proj.condominio[2].casa.Cabana() + "m2");
    }
}
