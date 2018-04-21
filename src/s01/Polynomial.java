package s01;

public class Polynomial {

    public static final int MAXN=10;

    //写程序计算给定多项式在给定点x处的值
    //f(x)=a0+a1*x+a2*x*x+....an*x的n次
    public static void main(String[] args) {
        double[] a = new double[MAXN];
        for(int i=0;i<a.length;i++){
            a[i] = i;
        }

        Polynomial polynomial = new Polynomial();

        long start = System.currentTimeMillis();
//        System.out.println(polynomial.f1(MAXN-1,a,1.1));
        System.out.println(polynomial.f2(MAXN-1,a,1.1));
        long end = System.currentTimeMillis();

        System.out.println("cost:"+(end-start));
    }

    public double f1(int n, double[] a,double x){
        double p = a[0];
        for(int i=0;i<=n;i++){
            p = p + (a[i]*Math.pow(x,i));
        }
        return p;
    }

    public double f2(int n, double a[],double x){
        double p = a[n];
        for(int i=n;i>0;i--){
            p = a[i-1] +x*p;
        }
        return p;
    }


}
