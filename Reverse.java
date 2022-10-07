
class reverse {
    public static void main (String[] args) {
        reverseWord("This is an example!");
    }

    static void reverseWord(String word){
        char ch;
        String nstr="";
        for (int i=0; i<word.length(); i++){
        ch= word.charAt(i);
        nstr= ch+nstr;
      }
      System.out.println(nstr);

    }
}