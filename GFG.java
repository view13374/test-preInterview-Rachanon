class GFG{
      public static void main (String[] args){
        String s = "this is a word";
        String sAns = "";
        String[] arr = s.split(" "); 
        int i;
        char ch;
        int ans = 0;
        int nans = 0;
        for(int m = 0;m<arr.length;m++){
            String str = arr[m];
            char[] word = new char[str.length()];
            for(int j = 0;j < str.length();j++){
                word[j] = str.charAt(j);
            }
            for (int c = 0 ; c < word.length ; c++) { 
                for(ch = 'a',i=1;ch <= 'z';ch++,i++){
                    if(word[c] == ch){
                        ans = ans + i;
                    }
                }
                if(ans > nans){
                    nans = ans; 
                    sAns = arr[m];
                } 
            }
            ans = 0;
        }
        System.out.println(nans);
        System.out.println(sAns); 
    } 
}