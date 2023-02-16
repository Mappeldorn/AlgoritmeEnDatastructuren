package week01;

public class Main {

    //O(1)
    public void excellent(String test) {
        int n = 500;
        System.out.println("n = " + n);
    }

    //O(n)
    public void good(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Number: " + n);
        }
    }

    //O(n log n)
    public void okay(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j < n; j = j * 2) {
                System.out.println("Number: " + n);
            }
        }
    }

    //O(n^2)
    public void bad(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

            }
        }
    }
}
