package recursion;
class repeat{
    public static void fun(int x){
        if(x<1){
            return ;
        }
        else{
            System.out.print(x + " ");
            fun(x-1);
            System.out.print(x + " ");
            return ;
        }
    }
    public static void main (String []args){
        int x = 5;
        fun(x);
    }
}
