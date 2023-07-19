public class array {
    public static void main(String args[]){
        int []a=new int[5];
        int b[]={12,13,50};
        a[0]=10;
        a[1]=20;
        a[2]=30;

        for(int element:a){
            System.out.println(element);
        }
        for(int element:b){
            System.out.println(element);
        }
    }
}
