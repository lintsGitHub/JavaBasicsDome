package org.lint.Service;

public class StringOperationImpr implements StringOperation {

    //private String string;

    @Override
    public String reverse(String string) {
        if(string == null || string.length()<=1)
            return string;
//        把字符串中的第一个拿到最后，然后使用递归进行循环
        return reverse(string.substring(1))+string.charAt(0);
    }

    @Override
    public String clearTrim(String string) {
        return string.trim();
    }




    @Override
    public  String resAChar(String string) {
        if (string == null)
            return null ;
        String s = clearTrim(string);
        return resRen(s);
    }


    @Override
    public String resRen(String string) {
        StringBuffer buffer = new StringBuffer(string);
        int len = string.length();
        for (int i = 0; i < len; i++) {
            String c = String.valueOf(string.charAt(i));
            //System.out.println(buffer.indexOf(c));
            //System.out.println(buffer.lastIndexOf(c));
            if(buffer.indexOf(c) == buffer.lastIndexOf(c)){
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty(String string) {

        if (string == null || clearTrim(string).length()<1)
            return true;
        return false;
    }

    @Override
    public String rotate(String string) {
        if (isEmpty(string))
            return string;
       // String str = clearTrim(string);
        char[] ch = string.toCharArray();
        int size = ch.length;
        for (int i = 0 ;i< size ; i++) {
            if((ch[i] >= 65 && ch[i] <78 ) || (ch[i] >= 97 && ch[i]<110)){
                ch[i] = (char) ((int)ch[i] +13);
                //System.out.println(ch[i]);
            }else if ((ch[i] >= 78 && ch[i] <=90 ) || (ch[i] >= 110 && ch[i]<=122)){
                ch[i] = (char)((int) ch[i] - 13);
                //System.out.println(ch[i]);
            }
        }
        return String.valueOf(ch);
    }

    public String rude(long len){

        return null;
    }


}
