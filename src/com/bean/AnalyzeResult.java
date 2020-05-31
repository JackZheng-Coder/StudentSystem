package com.bean;

/**
 * @ClassName:分析结果类
 * @Description:
 * @author:ZYX
 * @date:2020/2/25
 * @Version:1.0
 * @Copyright:
 */
public class AnalyzeResult {
    private String studentId; //学生学号
    private String studentName; //学生姓名
    private String sumScore;    //学生总成绩
    private String avgScore; //学生平均成绩

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSumScore() {
        return sumScore;
    }

    public String getAvgScore() {
        return avgScore;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSumScore(String sumScore) {
        this.sumScore = sumScore;
    }

    public void setAvgScore(String avgScore) {
        this.avgScore = avgScore;
    }
}
