class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder(s);


        int left = 0;
        int right = s.length()-1;

        while(left<right){
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if(isVowel(c1) == true && isVowel(c2)==false){
                right--;
            }else if(isVowel(c2) == true && isVowel(c1)==false){
                left++;
            }else if(isVowel(c1)!= true && isVowel(c2)!= true){
                left++;
                right--;
            }else if(isVowel(c1) && isVowel(c2)){
                result.setCharAt(left,c2);
                result.setCharAt(right,c1);
                left++;
                right--;
            }
        }
        return result.toString();

    }

    static boolean isVowel(char c){
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default : return false;
        }
    }
}