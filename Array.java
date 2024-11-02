public class Array {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 1;
        // arr[3] = 9;
        // arr[4] = 0;
        // for(int i=0; i<5; ++i){
        //     System.out.print(i + " ");
        // }
        for(int i=0; i<3; ++i){
            for(int j = 0; j<4; ++j){
                arr[i][j] = (int)(Math.random()*10);
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