public class AreaCasa {
//isso é um atributo=========
//Variavel Global ou seja pode ser usada em todos os metodos
static double valorM2 = 1500;
//==== !!!!NÃO FAÇA TODAS AS VARIAVEIS GLOBAIS !!!!!!! ========

   static void Cabana(float lateral, float cquarto) {
      float areaq; //área do quarto
      float areas; //área da sala
      float areat; //area tootal
        // Isso printa a mennsagem "Programa Para o Calculo da area da Casa"
        System.out.println("Programa Para o Calculo da area da Casa");
        areas = lateral*lateral;
        System.out.println("A area da sala equivale "+areas);
        areaq = cquarto*(lateral/2);
        System.out.println("A area do quarto equivale "+areaq);
        System.out.println("A area do banheiro equivale "+areaq);
        areat = areas + 2*areaq;
        System.out.println("A area total equivale: "+areat);
}
//
static double valor(double area){
valorM2 = 5;
return (valorM2*area);
}

//===================================================
//========== Aqui Começa ===============
//====== A Area da Piscina =======
//====== E termina ==========
//========= A Area da CABANA =====================
//=====================================================
 static double Piscina(double raio){ //variavel declarada no parametro
  return (Math.PI * Math.pow(raio,2));
}
//=================
//===== A execuçao do Programa
// ===== começa Aqui
//========
public static void main(String[] args) {
//area da piscina
double areap;
Cabana(11,7);
areap = Piscina(2); //valor declarado no parametro para variavel raio =2

System.out.println("Area da Piscina: "+areap);

}

}
