
public class Main {
    public static  void main(String[] args) {
        data d1 = new data() ;
        d1.Dia =31;
        d1.mes = 12;
        d1.ano = 2022;

        var d2 = new data(31,012,2020);
        d2.Dia = 31;
        d2.mes = 2;
        d2.ano =2023;

        String DataFormatada1 = d1.obterDataFormatada();

        System.out.printf(DataFormatada1 + "\n");
        System.out.printf(d2.obterDataFormatada() +"\n");

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();

    }
}