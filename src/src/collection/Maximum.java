package collection;

/**
 * Created by expert on 8/14/18.
 */
public class Maximum {
    public static void main(String[] args) {
        int a[]={10,74,30,46,20,36,78,45};

        int max=a[0];
        int secondmax=a[0];
        for (int i=0;i<a.length;i++){

                if (max<a[i]){
                   max=a[i];
                }

            }
        for (int j=0;j<a.length;j++){
            if ((secondmax < a[j]) && (a[j] < max)){
                secondmax=a[j];
            }
        }
        System.out.println(secondmax);
        System.out.println(max);



//        for (int i=0;i<a.length;i++){
//            for (int j=i+1;j<a.length;j++){
//                if (a[i]>a[j]){
//                    int temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        System.out.println("after sorting");
//        for (int k=0;k<a.length;k++){
//            System.out.println(a[k]);
//        }
//        System.out.println("first maximum is : "+a[a.length-1]);
//        System.out.println("second maximum is : "+a[a.length-2]);
   }
}
