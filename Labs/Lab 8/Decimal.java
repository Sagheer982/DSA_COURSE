public class Decimal {

    public String DecimaltoBinary(int num){
         if(num==0){
             return "0";
         }
         if(num==1){
             return"1";
         }
          return DecimaltoBinary(num/2)+(num%2);

    }

    public static void main(String args[]){
        Decimal nn=new Decimal();
        int num=13;
        String Binary = nn.DecimaltoBinary(13);
        System.out.println(Binary);
    }

}