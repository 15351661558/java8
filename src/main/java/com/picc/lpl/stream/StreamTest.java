package com.picc.lpl.stream;

import com.picc.lpl.vo.User;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<User> userList = Arrays.asList(new User("张三", 20, "男", "上海市"),
                new User("李婷", 22, "女", "南京市"),
                new User("周华", 28, "男", "无锡市"),
                new User("吴云", 19, "女", "杭州市"),
                new User("张宇", 26, "男", "北京市"));

        //过滤年龄在20岁以上的
        List<User> list2=new ArrayList<>();
        for (User user : userList) {
            if(user.getAge()>20){
                list2.add(user);
            }
        }
        System.out.println(list2);

        List<User> list3 = userList.stream().filter(u -> u.getAge() > 20).collect(Collectors.toList());
        System.out.println(list2);

        //去重
        System.out.println();
        List<User> list4 = userList.stream().distinct().collect(Collectors.toList());
        System.out.println(list4);

        //排序
        System.out.println();
        List<User> list5 = userList.stream().sorted(Comparator.comparing(u->u.getAge())).collect(Collectors.toList());
        List<User> list6 = userList.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        System.out.println(list5);
        System.out.println(list6);

        //limit
        System.out.println();
        List<User> list7 = userList.stream().sorted(Comparator.comparing(User::getAge)).limit(2).collect(Collectors.toList());
        System.out.println(list7);

        //skip
        System.out.println();
        List<User> list8 = userList.stream().sorted(Comparator.comparing(User::getAge)).skip(2).collect(Collectors.toList());
        System.out.println(list8);

        //map 比如获取所有人员的address
        System.out.println();
        List<String> list9=new ArrayList<>();
        for (User user : userList) {
            list9.add(user.getAddress());
        }
        System.out.println(list9);
        List<String> list10 = userList.stream().map(u -> u.getAddress()).collect(Collectors.toList());
        System.out.println(list10);

        //joining 获取所有用户的姓名 并且用逗号拼接成字符串
        System.out.println();
        String nameStr="";
        for (User user : userList) {
            nameStr+=user.getName()+",";
        }
        if(!StringUtils.isEmpty(nameStr)){
            nameStr=nameStr.substring(0,nameStr.length()-1);
        }
        System.out.println(nameStr);
        String s = userList.stream().map(User::getName).collect(Collectors.joining(","));
        System.out.println(s);

        //groupingBy分组  按照性别分组
        System.out.println();
        Map<String, List<User>> map = userList.stream().collect(Collectors.groupingBy(User::getSex));
        Map<String, List<User>> map2 = userList.stream().collect(Collectors.groupingBy(u->u.getSex()));
        System.out.println(map);
        System.out.println(map2);


    }

}
