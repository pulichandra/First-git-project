//git project
public class Genarics <T,U>{
    T obj1;
    U obj2;

    Genarics(T obj1,U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public void display(){
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args){
        Genarics<Integer,String> gn = new Genarics<Integer,String>(10,"brand");
        gn.display();
    }
}
