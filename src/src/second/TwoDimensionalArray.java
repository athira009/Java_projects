package second;

/**
 * Created by expert on 7/2/18.
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
//row wise sorting
   /* int x[][]={{3,6,1},{1,7,6}};
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++) {
            //System.out.print(x[i][j] + " ");
        }}

        for (int i=0;i<=x.length-1;i++){
            for (int j=0;j<=x[0].length-1;j++){
                for (int k=j+1;k<=x[0].length-1;k++){
                if(x[i][j]>x[i][k]){
                    int temp=x[i][j];
                    x[i][j]=x[i][k];
                    x[i][k]=temp;

                }}
                        System.out.print(x[i][j] + " ");

            }
            System.out.println("\n");
    }

        //ystem.out.println("\n");
    System.out.println("no of columns : "+x[0].length);
        System.out.println("no of rows : "+x.length);
        System.out.println(x[1][2]);*/

//Column wise sorting
        int x[][]={{33,60,1},{1,7,6}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++) {
                //System.out.print(x[i][j] + " ");
            }}

        for (int i=0;i<=x.length-1;i++){
            for (int j=0;j<=x[0].length-1;j++){
                for (int k=i+1;k<=x.length-1;k++){
                    if(x[i][j]>x[k][j]){
                        int temp=x[i][j];
                        x[i][j]=x[k][j];
                        x[k][j]=temp;

                    }}
                System.out.print(x[i][j] + " ");

            }
            System.out.println("\n");
        }

        //ystem.out.println("\n");
        System.out.println("no of columns : "+x[0].length);
        System.out.println("no of rows : "+x.length);
        System.out.println(x[1][2]);


}}
