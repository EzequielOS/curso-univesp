public class HelloWorld {

    public static void main(String[] args) {
      int lateral = 10;
      int cquarto = 7;
      int areaq; //área do quarto
      int areas; //área da sala
      int areat; //area tootal

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

}
