import java.text.DecimalFormat;
 public class AreaCasa {
//isso é um atributo=========
//Variavel Global ou seja pode ser usada em todos os metodos
    static double valorM2 = 1500;

//==== !!!!NÃO FAÇA TODAS AS VARIAVEIS GLOBAIS !!!!!!! ========
    static double valor(double area){
      if (area >= 0) return(valorM2*area);
        return (-1);
}

    static void Cabana(float lateral, float cquarto) {
//área do quarto //área da sala //area tootal //respectivamente
          float areaQuarto; float areaSala; float areaTotal;
//----------------------------------------------------------------------
//Usando operadores LOGICOS **copia da linha 37 - 52**
/*
################ OPERADOR "OU" || ################
if (lateral<0 || cquarto<0)
System.out.println("Erro:lateral da sala menor que 0");
################ OPERADOR "E" && ################
if (lateral<0 && cquarto<0)
System.out.println("Erro:lateral da sala menor que 0");
################ OPERADOR "NAO" ! ################
if (!lateral<0 && cquarto<0)
System.out.println("Erro:lateral da sala menor que 0");
else{
System.out.println("Programa Para o Calculo da area da Casa");
areaSala = lateral*lateral;
################ OPERADOR ""  ################
return ((raio >= 0) ? Math.PI*Math.pow(raio,2) : (-1);
\\\\\\\\linhas 60 - 62 operador condiçao////////
[ . . . ]
###################################################*/
//------------------------------------------------------------
//Aninhamento de CONDICIONAIS **********************************
  if (lateral<0) System.out.println("Erro:lateral da sala menor que 0");
  else {
        if (cquarto<0) System.out.println("Erro:lateral da quarto menor que 0");
        else{
        // Isso printa a mennsagem "Programa Para o Calculo da area da Casa"
        System.out.println("Programa Para o Calculo da area da Casa");
        areaSala = lateral*lateral;
        System.out.println("A area da sala equivale: "+areaSala);
        areaQuarto = cquarto*(lateral/2);
        System.out.println("A area do quarto equivale: "+areaQuarto);
        System.out.println("A area do banheiro equivale: "+areaQuarto);
        areaTotal = areaSala + 2*areaQuarto;
        System.out.println("A area total equivale: "+areaTotal);
    }
  }
}
//*************************************************************
//========== Aqui Começa ===============
//====== A Area da Piscina =======
//====== E termina ==========
//========= A Area da CABANA =====================
//=====================================================
 static double Piscina(double raio){ //variavel declarada no parametro
   if (raio >= 0)  return Math.PI * Math.pow(raio,2);
   else return(-1);
}
//=================
//===== A execuçao do Programa
// ===== começa Aqui
//========
public static void main(String[]args) { //só pode existir 1 "public static void main(String[]args)"
//area da piscina
double areaPiscina;
DecimalFormat dc = new DecimalFormat("0.00");
Cabana(11,7);
areaPiscina = Piscina(2); //valor declarado no parametro para variavel raio =2

System.out.println("Area da Piscina: "+dc.format(areaPiscina));

//Foi colocado aqui diferente do Exemplo *vide linha 40
double precoConstrucao;
boolean valorOK = false; //sempre true ou false
precoConstrucao = valor(20);
valorOK = precoConstrucao >= 0;
System.out.print("Valor para construir "); //o print difere != do println, pois nao salta linha ao final
if(valorOK)System.out.println("equivalente:"+precoConstrucao);
else System.out.println("nao foi obtido: AREA NEGATIVA!!!");

}

}
