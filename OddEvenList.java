import java.util.ArrayList;
import java.util.Random;

public class OddEvenList<T>{

    ArrayList<T> values = new ArrayList<>(); 
    T input;
    int add(T input){
        values.add(input);
        int index = values.indexOf(input);
        return index;
    }
    void getOdd(){
        for(int i=1 ; i<values.size() ; i += 2){
            System.out.println("Odd index number : " + values.get(i));
        }
    }
    void getEven(){
        for(int i=0 ; i<values.size() ; i += 2){
            System.out.println("Even index number : " + values.get(i));
        }
    }
    void getRandom(){
        Random random = new Random();
        for(int i=0 ; i<values.size() ; i ++){
            int num = random.nextInt(values.size());
            System.out.println("Random index number : "+ values.get(num));
        }
    }
    public void print(){
        System.out.println(values);
    }
    boolean remove(int index){ 
        if(values.size() > index){
            values.remove(index);
            return true;
        }
        else{
            return false;
        } 
    }
}



