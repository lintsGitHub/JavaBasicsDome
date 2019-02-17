package org.lint.Service;

public interface StringOperation {
    // 翻转字符串
    String reverse(String string);
    //去空格
    String clearTrim(String string);
    //先去空格，然后返回一个第一个不重复的字符
    String resAChar(String string);
    //    返回一个第一个不重复的字符
    String resRen(String string);
    // 判断是否为空，null
    boolean isEmpty(String string);
//    使用英文加密 26位字母对位加密
    String rotate(String string);
}
