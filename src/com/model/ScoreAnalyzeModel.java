package com.model;

import com.bean.AnalyzeResult;
import com.bean.Student;
import com.dao.ManageHelper;
import javafx.scene.input.Mnemonic;

import javax.swing.table.AbstractTableModel;
import java.util.HashMap;
import java.util.Vector;

/**
 * @ClassName:成绩分析模型
 * @Description:
 * @author:ZYX
 * @date:2020/5/27
 * @Version:1.0
 * @Copyright:
 */
public class ScoreAnalyzeModel extends AbstractTableModel {
    private ManageHelper helper;
    private Vector<Student> students;
    private Vector<String> columnNames = null;	//列名
    private Vector<Vector<String>> rowData = null;	//行数据

    public ScoreAnalyzeModel(String major_Name,String grade,String classe){
        helper = new ManageHelper();
        Vector<String> courses = helper.getCourse(helper.getAllMajor().get(major_Name),grade); //获得课程
        Vector<AnalyzeResult> results = helper.analyzeScore(major_Name,classe,grade); //得到分析的结果集合

        columnNames = new Vector<>();
        rowData = new Vector<Vector<String>>();
        columnNames.add("学号");
        columnNames.add("姓名");

        for (int i = 0; i<courses.size();i++){
            columnNames.add(courses.get(i));
        }
        columnNames.add("总成绩");
        columnNames.add("平均成绩");
        columnNames.add("排名");
        for (int i = 0;i<results.size();i++){
            Vector<String> hang = new Vector<>();
            AnalyzeResult result = results.get(i);
            hang.add(result.getStudentId());
            hang.add(result.getStudentName());
            HashMap<String, String> scores = helper.getStudentScore(result.getStudentId());	//得到所有课程
            for (int j = 0;j<scores.size();j++){
                String score = scores.get(courses.get(i)); //得到成绩
                hang.add(score);
            }
            hang.add(result.getSumScore());
            String avg = result.getAvgScore();
            hang.add(avg.charAt(0)+""+avg.charAt(1)+""+avg.charAt(2)+""+avg.charAt(3));
            hang.add(getRowCount()+1+"");
            rowData.add(hang);
        }
    }

    @Override
    public int getRowCount() {
        return this.rowData.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.size();
    }
    //得到某行某列的数据
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return ((Vector)this.rowData.get(rowIndex)).get(columnIndex);
    }
    //重写方法 getColumnName
    @Override
    public String getColumnName(int column) {
        // TODO Auto-generated method stub
        return (String)this.columnNames.get(column);
    }
}
