public class Palindrom {
    static boolean palidron(int number){
        int temp=number, lastnumber,palid=0;
        while (temp!=0){
            lastnumber=temp%10;
            palid = (palid*10)+lastnumber;
            temp/=10;
        }if(number==palid){
        return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palidron(44));
    }
}