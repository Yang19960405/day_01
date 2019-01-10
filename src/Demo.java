import java.lang.*;
import java.util.*;

public class Demo {
    public static void main(String[] args){
        ArrayList<String> arrayList=new ArrayList<String>();
        for (int i=0;i<10;i++)
        arrayList.add("aaaa"+i);

        Iterator<String> iterator=arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());


        }
        int a=(67+87+72+86+77+79+89+83+60+70+69+84+85+87+90+78+85+60+86+88+81+60+76+60+76+60+70+79+74+86+63+83+84+80+88+60+80+67)/37;
        System.out.println(a);
    }
}
