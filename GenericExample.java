public class GenericExample {
    public static void main(String[] args){
        OddEvenList<Integer> num = new OddEvenList<>();
        num.add(4);
        num.add(7);
        num.add(9);
        num.add(10);
        num.add(11);
        num.add(12);
        //num.remove(5);
        num.print();    // show all //
        System.out.println("------------------------");
        num.getOdd();
        System.out.println("------------------------");
        num.getEven();
        System.out.println("------------------------");
        num.getRandom();
    }
}