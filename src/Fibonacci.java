public class Fibonacci{
    public static void main(String args[]){
        int a1=20,a2=21,a3,i,count=30;
        System.out.println(a1+" "+a2);
        for (i=22;i<count;i++){
            a3=a1+a2;
            System.out.println(" "+a3+" ");
            a1=a2;
            a2=a3;


        }

        //System.out.println(""+c);

    }
}