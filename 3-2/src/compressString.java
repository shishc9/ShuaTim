/**
 * @PackageName:PACKAGE_NAME
 * @Date:2021/3/24, 11:49
 * @Auther:ShiShc
 */

public class compressString {

    public static String compressString(String str) {
        int flag=1;
        StringBuffer str2=new StringBuffer();

        if(str.length()<=2) {
            return str;
        }

        for(int i =1;i<str.length();i++) {

            if(str.charAt(i-1)==str.charAt(i)) {
                flag++;
            }else {
                str2.append(str.charAt(i-1)).append(flag);
                flag=1;
            }
        }

        str2.append(str.charAt(str.length()-1)).append(flag);

        if(str.length()<=str2.length()) {
            return str;
        }else{
            return str2.toString();
        }

    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
        System.out.println(compressString("abcd"));
        System.out.println(compressString("aabb"));
    }
}
