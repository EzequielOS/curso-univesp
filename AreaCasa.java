public class AreaCasa {

   static void Cabana() {
      float lateral = 11;
      float cquarto = 7;
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
//===================================================
//========== Aqui Começa ===============
//====== A Area da piscinadohello =======
//====== E termina ==========
//========= A Area da CABANA =====================
//=====================================================
 static double Piscina(double raio){
  return (Math.PI * Math.pow(raio,2));
}
//=================
//===== A execuçao do Programa
// ===== começa Aqui
//========
public static void main(String[] args) {
//area da piscina
double areap;
Cabana();
areap = Piscina(2);

System.out.println("Area da Piscina: "+areap);

}

}
