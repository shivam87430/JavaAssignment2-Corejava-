package Questions.question2;

public class StringSort {
    public static void main(String[] args) {

        String str = "shivam";
        char[] chars = str.toCharArray();
        char temp;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length-1; j++) {
                if(chars[j]>chars[j+1]){
                    temp=chars[j];
                    chars[j]=chars[j+1];
                    chars[j+1]=temp;
                }


            }

        }
        for(int k=0;k<chars.length;k++){
            System.out.println(chars[k]);
        }

    }
}
