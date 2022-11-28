package Q2.BigOLab;

public class Main {
    public static void main(String[] args) {
        BigO bigO = new BigO();
        bigO.one("Test Case 1");
        bigO.n("Test Case 2",2);
        bigO.nSquared("Test Case 3",3);
    }

    static class BigO{
        public BigO(){
        }
        public void one(String s){
            System.out.println(s);
        }
        public void n(String s,int n){
            for(int i=0;i<n;i++){
                System.out.println(s);
            }
        }
        public void nSquared(String s,int n){
            for(int i=0;i<n;i++){
                for(int o=0;o<n;o++){
                    System.out.println(n);
                }
            }
        }
    }
}
