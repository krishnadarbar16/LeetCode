class Solution {
    public String interpret(String command) {
        StringBuilder result = new StringBuilder();

        for(int i=0;i<command.length();i++){
            char ch = command.charAt(i);

            if(ch == 'G'){
                result.append("G");
            }else if(ch == '('){
                int j = i+1;
                if(command.charAt(j) == ')'){
                    result.append("o");
                    i++;
                }
                if(command.charAt(j) == 'a'){
                    result.append("al");
                    i += 2;
                }
            }
        }
        return result.toString();
    }
}