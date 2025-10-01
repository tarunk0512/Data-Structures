package Practice.Strings.Easy;

public class ToggleCase {
    public static void main(String [] args){
        String s = "aLeEtCoDe";
        System.out.println(toggleCase(s));

    }

    //Toggle Case
// Input: "HeLLo" → Output: "hEllO"

    public static String toggleCase(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
        }
return sb.toString();
    }

}
