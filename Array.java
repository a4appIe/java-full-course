public class Array {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[2];
        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 1;
        // arr[3] = 9;
        // arr[4] = 0;
        // for(int i=0; i<5; ++i){
        // System.out.print(i + " ");
        // }
        // for(int i=0; i<3; ++i){
        // for(int j = 0; j<4; ++j){
        // arr[i][j] = (int)(Math.random()*10);
        // }
        // }

        // for(int m[]: arr){
        // for(int n: m){
        // System.out.print(n + " ");
        // }
        // System.out.println();
        // }
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int m[]: arr){
            for(int n: m){
                System.out.print(n + " ");
            }
            System.out.println();
        }
 
    }
}