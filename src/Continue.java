public class Continue {
    public static void main(String args[]) {
        for(int i=11;i<=30;i++){
            if(i==12|i==14|i==16|i==18|i==28){
                continue;
            }
            System.out.println(i);
        }
    }
}