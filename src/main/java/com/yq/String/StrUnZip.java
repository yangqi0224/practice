package com.yq.String;

/**
 * 字符串解压
 */
public class StrUnZip {

    public static void main(String[] args) {
        String str = "a1b2c6ad4hh8";
        String result = strUnZip(str);
        System.out.println(result);
    }

    public static String strUnZip(String str){

        String result = "";

        for (int i = 0; i<str.length();i++){
            int j;

            for (j = i;;j++){
                if (str.charAt(j)>='0'&&str.charAt(j)<='9')
                    break;
            }
            String tmp = str.substring(i,j);
            System.out.println("tmp detail is : "+tmp);
            i = j;

            for (j = i;j<str.length();j++){
                if (str.charAt(j)<'0'||str.charAt(j)>'9'){
                    break;
                }
            }
            String num = str.substring(i,j);
            i = j-1;

            int loop = Integer.valueOf(num);

            //解压
            /*for (int p = 0;p<loop;p++){
                result += tmp;
            }*/

            //剔除数字
            result += tmp;
        }

        return result;
    }
}
