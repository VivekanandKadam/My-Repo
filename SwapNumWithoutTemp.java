class Swapping{
        int a,b;
        void SwapNum(int a,int b){
            a = a + b;
            b = a - b;
            a = a - b;
        System.out.println("Numbers after swap \n a = "+a+"\n b = "+b);
    }    
}
class SwapNumWithoutTemp{
    public static void main(String[] args) {
        Swapping s = new Swapping();
        int x = 20, y = 30;
        System.out.println("Before Swap \n a = "+x+"\n b = "+y);
        s.SwapNum(x,y);
    }
}