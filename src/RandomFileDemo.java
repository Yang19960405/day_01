
import java.io.RandomAccessFile;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomFileDemo {
    public static void main(String args[]) throws Exception
    {

        Employee1 e1=new Employee1("张三",22);
        Employee1 e2=new Employee1("李四",23);
        Employee1 e3=new Employee1("王五",12);

        RandomAccessFile randomAccessFile=new RandomAccessFile("D:\\employee.txt","rw");
        randomAccessFile.write(e1.getName().getBytes());
        randomAccessFile.writeInt(e1.getAge());
        randomAccessFile.write(e2.getName().getBytes());
        randomAccessFile.writeInt(e2.getAge());
        randomAccessFile.write(e3.getName().getBytes());
        randomAccessFile.writeInt(e3.getAge());
        randomAccessFile.close();

        RandomAccessFile randomAccessFile1Two=new RandomAccessFile("D:\\employee.txt","r");
        int len=8;

    }


}


class Employee1{


    private String name;
    private int age;
    final static  int LEN=8;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee1(String name,int age){
        if(name.length()>LEN){
            name.substring(0,8);
        }
        else {
            while (name.length()<LEN)
                name=name+"\u0000";
        }

        this.age=age;
        this.name=name;
    }
}
