public class AreaCasa {

    public static void main(String[] args) {
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

//===================================================
//========== Aqui Começa ===============
//====== A Area da piscinadohello =======
//====== E termina ==========
//========= A Area da CABANA =====================
//=====================================================

//raio da piscina
double raio = 2;
//area da piscina
double areap;

areap = Math.PI * Math.pow(raio,2);

System.out.println("Area da piscinadohello: "+areap);
    }

}
