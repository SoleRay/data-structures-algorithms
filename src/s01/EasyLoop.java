package s01;

public class EasyLoop {

    public void methodLoop(int n){
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }

    public void methodRecursion(int n){
        if(n>0){
            methodRecursion(n-1);
            System.out.println(n);
        }
    }

    //n到100000的时候，递归挂了
    //虽然递归简洁易懂，但是递归吃空间
    public static void main(String[] args) {
        int n = 100000;

        EasyLoop loop = new EasyLoop();
        long start = System.currentTimeMillis();
//        loop.methodLoop(n);
        loop.methodRecursion(n);
        long end = System.currentTimeMillis();

        System.out.println("cost:"+(end-start));


    }
}
