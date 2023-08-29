import java.util.*;

import src.StuGroup;
import src.Student;

public class App {
    public static void main(String[] args) {
        StuGroup group = new StuGroup(20);
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.print("需要输入几个学生：");
        num = reader.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名、地址、性别、年龄、数学、英语信息：");
            group.addStu(new Student(reader.next(),
                    reader.next(),
                    reader.next().charAt(0),
                    reader.nextInt(),
                    reader.nextInt(),
                    reader.nextInt()));
        }
        System.out.print("删除第几个学生：");
        group.removeStu(reader.nextInt());
        System.out.println("最新的学生信息是：");
        group.printelem();
        reader.close();
    }
}