

import java.util.Date;
import java.time.*;

public class ReflectionTest {
    public static void main(String[] args)throws Exception{
        Date dt=new Date();
        Class <?> cls=dt.getClass();
        System.out.println(cls);

       Books books=(Books)Class.forName("Books").newInstance();

       books.setTitle("龙族");
       books.setPrice(12);
       System.out.println(books);
    }
}

class Books{


    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Books(String Title,int price){
        this.title=Title;
        this.price=price;

    }
    @Override
    public String toString(){
        return "图书名称："+this.title+",价格："+this.price;
    }


}
