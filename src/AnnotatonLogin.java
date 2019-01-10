import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.*;
import java.lang.annotation.*;
import java.lang.*;
import java.util.*;
import java.io.*;

public class AnnotatonLogin {

    public static void main(String[] args) throws Exception{
        AnnotatonLogin annotatonLogin=new AnnotatonLogin();
        annotatonLogin.aaa();

        String name=new BufferedReader(new InputStreamReader(System.in)).readLine();
        String pass=new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(annotatonLogin.IsLogin(name,pass));
    }

    @Login(name = "用户名",pass = "密码")
    public Boolean IsLogin(String name,String pass) throws Exception{

        Class<?> cls=Class.forName("AnnotatonLogin");
        Method method=cls.getMethod("IsLogin", String.class, String.class);
        Login login=method.getAnnotation(Login.class);



        String name1 = login.name();
        String pass1=login.pass().toString();
        System.out.println(name1 + pass1 + name + pass);
        if(name1.equals(name)||pass1.equals(pass)) {
            System.out.println(login.name() + login.pass() + name + pass);
            return true;
        }
        else {
            return false;
        }
    }

    public void aaa(){}
}

@Retention(value = RetentionPolicy.RUNTIME)
@interface Login{
    public String name();
    public String pass();



}

