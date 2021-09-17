/**
 * @PackageName: PACKAGE_NAME
 * @Date: 2021/1/19, 20:34
 * @Auther: ShiShc
 * 6. Z字型变换
 */

public class convert {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
        String s1 = "A";
        System.out.println(convert(s1, 2));
        String s2 = "AB";
        System.out.println(convert(s2, 1));
        String s3 = "ABC";
        System.out.println(convert(s3, 2));
    }

    public static String convert(String s, int numRows) {
        if(s.length() < numRows) {
            numRows = s.length();
        }

        if(numRows == 1) {
            return s;
        }

        int overflow = 0;
        int sPos = 0;
        int resPos = 0;

        char[] result = new char[s.length()];
        for(int i = 1;i <= numRows; ++i) {
            if(i == 1) {
                while(overflow == 0) {
                    result[resPos++] = s.charAt(sPos);
                    sPos += 2*(numRows - i);
                    if(sPos > s.length()-1) {
                        overflow = 1;
                    }
                }
                sPos = 0;
                overflow = 0;
            } else if(i == numRows) {
                sPos = numRows-1;
                while (overflow == 0) {
                    result[resPos++] = s.charAt(sPos);
                    sPos += 2*(i-1);
                    if(sPos > s.length()-1) {
                        overflow = 1;
                    }
                }
                sPos = 0;
                overflow = 0;
            } else {
                boolean flag = true;
                sPos = i-1;
                while (overflow == 0) {
                    if(flag) {
                        result[resPos++] = s.charAt(sPos);
                        sPos += 2*(numRows - i);
                        if(sPos > s.length()-1) {
                            overflow = 1;
                        }
                        flag = false;
                    } else {
                        result[resPos++] = s.charAt(sPos);
                        sPos += 2*(i - 1);
                        if(sPos > s.length()-1) {
                            overflow = 1;
                        }
                        flag = true;
                    }
                }
                overflow = 0;
                sPos = 0;
            }
        }

        return String.valueOf(result);
    }
}
