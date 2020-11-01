package cn.itcast.day08.demo02;
/*
题目： {1,2,3} 拼接成： [1#2#3]

 */
public class Demo06StringPractise {

    public static void main(String[] args) {
        String[] array1 = {"yhyifj","我爱你","你是最可爱的"};
        String str = arrayToString(array1);
        System.out.println(str);

    }

    public static String arrayToString(String[] strings){

        String str1 = "[";

        for (int i = 0; i < strings.length; i++) {
            if(i != strings.length - 1){
                str1 = str1.concat(strings[i] + "#");
            }else {
                str1 = str1.concat(strings[i] + "]");
            }
        }
        return str1;
    }

}
