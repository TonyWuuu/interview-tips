package JVM;

/*
 * 父类
 */
public class JVMParent {

    public static int width = 100;

    public static int count;

    {
        System.out.println("parent no static code block :" + count);
    }

    static{
        System.out.println("parent static's count:" + count);
    }

    JVMParent(int a){
        System.out.println("parent init one parameter");
    }

    JVMParent(){
        System.out.println("parent init");
    }

}