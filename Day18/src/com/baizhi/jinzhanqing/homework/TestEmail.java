package com.baizhi.jinzhanqing.homework;

/*
* 4. (String 类)编程：给定一个邮箱“zhangmj@zparkhr.com”，根据下面要求完成程序代码：
* (1) 获取邮箱中的用户名：zhangmj
* (2) 验证邮箱“zhangmj@zparkhr.com”是否是一个合法的邮箱格式。
* 提示：① 邮箱必须包含“@”和“ . ” ② 最后一个“ . ”的位置必须大于“@”的位置。
* */
public class TestEmail {
    public static void main(String[] args) {
        String email = "zhangmj@zparkhr.com";
        String username = email.substring(0, email.indexOf("@"));
        System.out.println(username);
        if(email.indexOf('@')>=0&&email.indexOf('.')>=0&&email.indexOf('@')<email.indexOf('.'))
            System.out.println("邮箱是合法的");
        else
            System.out.println("邮箱是不合法的");
    }
}
