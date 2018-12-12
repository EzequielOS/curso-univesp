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

    static int buscaSeq(int[] arr, int el){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == el) return(i);
        }
        return(-1);
    }

    int buscaPiscSeq(double raio){
        for(int i = 0; i < this.condominio.length; i++){
            if (this.condominio[i].piscina.raio == raio){
                return(i);
            }
        }
        return(-1);
    }

    static int buscaBin(int[] arr, int el){
        int fim = arr.length-1;
        int ini = 0;
        while(ini <= fim){
            int meio = (fim + ini)/2;
            if(arr[meio] > el) {
                fim = meio -1;
            }else{
                return(meio);
            }
        }
        return(-1);
    }

    public static void main (String[] args){
        Projeto pr = new Projeto(5);

        for(int i = 0; i < pr.condominio.length; i++){
            AreaCasa c = new AreaCasa();
            AreaPiscina p = new AreaPiscina(i + 2);
            Residencia r = new Residencia(c,p);
            pr.adicionaRes(r);
        }

        System.out.println(pr.buscaPiscSeq(3));
        System.out.println(pr.buscaPiscSeq(15));

        int[] v = {9, 8, 4, 6, 3, 4};

        System.out.println("Elemento 4 na " + buscaSeq(v, 4) + "a posicao.");
        System.out.println("Elemento 12 na " + buscaSeq(v, 12) + "a posicao.");
    }
}
