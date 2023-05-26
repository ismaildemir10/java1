import java.util.ArrayList;
import java.util.Arrays;
public class AgainNumber {
    public static void main(String[] args) {
        int[] list = {2,4,5,5,6,3,4};
        ArrayList <Integer> a = new ArrayList<>();
        for(int i = 0; i<list.length; i++){
            for(int j = 0 ;j<list.length;j++ ){
                if((i!=j)&&list[i]==list[j]&&list[i]%2==0){
                    a.add(list[i]);
        }   }   }
        System.out.println(a);
}   }