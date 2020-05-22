package Procent;

public class Proc  {

    double sum;
    int pr;
    int s;
    

    public void Proc(double sum, int pr, int s){
        this.sum = sum;
        this.pr = pr;
        this.s = s;
    }
    public  Proc(){
         sum=0;
         pr=0;
         s=0;

    }
    public double getSum() {
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }

    public int getPr() {
        return pr;
    }
    public void setPr(int pr) {
        this.pr = pr;
    }

    public int getS() {
        return s;
    }
    public void setS(double s) {
        this.sum = s;
    }

       public void Prox(double sum, int pr) {

       s = (int) Math.round(sum / 100 * pr );
   }
}
