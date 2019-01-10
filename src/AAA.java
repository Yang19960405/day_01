public class AAA {
    public static void main(String[] args){
        MathDemo1 mathDemo1=new MathDemo1();
        mathDemo1.did();
        mathDemo1.cal();
    }
}

class MathDemo{
    void cal(){
        int a=0,i=0;
        System.out.println(""+a+""+i);
    }
}

class MathDemo1 extends MathDemo{
    public void did(){
        super.cal();
    }
}
