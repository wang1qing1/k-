public class qingwa {
    public static int tiao(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else {
            return tiao(n - 1) + tiao(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(tiao(5));
    }
}
