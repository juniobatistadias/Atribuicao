public class data {
    int Dia;
    int mes ;
    int ano;

data(){
    Dia = 1;
    mes = 1;
    ano=1970;

}
data(int Dia, int mes,int ano){
    this.Dia =Dia;
    this.mes = mes;
    this.ano = ano;


}
String obterDataFormatada(){
    return String.format("%d/%d/%d",Dia, mes, ano );
}
   void imprimirDataFormatada(){
      System.out.println(obterDataFormatada());

   }
}
