package collection;

import java.util.ArrayList;

/**
 * Created by expert on 7/2/18.
 */
//big shifting
public class Arrays {
    /*public static void main(String[] args) {
        int a[]=new int [3];
        int b[]={1,2,3};
        int []c=new int[4];
        c[0]=1;
        c[1]=2;
        c[2]=4;
        c[3]=3;
        int[] d=new int[]{5,9,10,20};
        int length=d.length;
        System.out.println(length);
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("\n");
        char ch[]={'A','B','C','D'};
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]+" ");
        }
        String[] str={"one","two","three","four"};
        for(int i=0;i<str.length;i++) {
            System.out.print(str[i] + " ");
        }
        for (String obj:str) {
            System.out.print(obj+"");//for each loop,iterating object
        }*/
        //reading from console and printing as an array
      /*int number[]=new int[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<number.length;i++) {
            number[i]=s.nextInt();
        }
            for (int j = 0; j < number.length;j++) {
                System.out.print(number[j] + " ");

        }}*/
public static void display(int x[]) {
    for (int i = 0; i < x.length; i++){
        System.out.println(x[i]);
        }
        System.out.println("after sorting");
    for (int i=0;i<=x.length-1;i++){
        for (int j=i+1;j<=x.length-1;j++){
            if(x[i]>x[j]){
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                //System.out.println(x[i]);
            }
        }}
        for (int k=0;k<x.length;k++){
            System.out.println(x[k]);
    }
}

    public static void main(String[] args) {
        Arrays obj=new Arrays();
        int []d=new int[]{5,2,4,1};
        display(d);
        ArrayList<String> al=new ArrayList<>();
        al.add("aa");
        for(String obj1:al){
            System.out.println(obj1);
        }
    }
}
