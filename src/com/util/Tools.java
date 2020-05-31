package com.util;

import java.util.Calendar;
import java.util.Vector;

/**
 * @ClassName:工具类
 * @Description:
 * @author:ZYX
 * @date:2020/5/27
 * @Version:1.0
 * @Copyright:
 */
public class Tools {
    //获取年级
    public static Vector<String> CreateGrade(){
        Vector<String> vector = new Vector<>();
        vector.add(""); //添加一个空选项
        Calendar c = Calendar.getInstance(); //获取日期
        int Year = c.get(Calendar.YEAR);
        for (int i = 0;i<7;i++){
            vector.add(String.valueOf(Year--));
        }
        return vector;
    }

    //生成学生学号的方法(学号：department+major+grade+classe+num)
    public static String CreateID(String grade,String classe,String major,String department,String num){
        String id = department+major+grade.charAt(2) + "" + grade.charAt(3)+classe+num;
        return id;
    }
}
