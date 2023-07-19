import java.util.*; 
public class sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []a=new int[5];
        System.out.println("Enter 5 numbers");
        for(int f=0;f<5;f++){
            a[f]=sc.nextInt();
        }int temp=0;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
              if(a[j]<a[i]){
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
              }
            }
        }
        System.out.println("Sorted numbers are:");
        for( int l=0;l<5;l++){
            System.out.println(a[l]);
        }
    }
}
