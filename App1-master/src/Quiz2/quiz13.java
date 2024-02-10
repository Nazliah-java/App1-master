package Quiz2;

import java.io.FileNotFoundException;
import java.io.IOException;

//step 1
abstract class Super{
    public abstract void m1() throws IOException;
}

//sub class 
class Sub extends Super{
    @Override
    public void m1() throws IOException{
        throw new FileNotFoundException();
    }
}

public class quiz13 {
    public static void main(String[] args){
        Super s = new Sub();
        try{
            s.m1();
            ;
        }catch (FileNotFoundException e){   //dia kena ikut susunan hierarchy, klau tak merah
            System.out.println("B");
        }catch (IOException e){
            System.out.println("A");
        }finally {
            System.out.println("C");
    
}
    }
}
