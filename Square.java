import java.util.ArrayList;


public class Square{
    public static void main(String[] args) {
        SquareDigit(9119);
        
    }
    
    static void SquareDigit(int n) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        do{
            array.add(n % 10);
            n /= 10;
        } while  (n > 0);
        for(int i=0 ; i<array.size() ; i++){
            int ans = array.get(i) * array.get(i);
            System.out.print(ans);
        }    
    }
}