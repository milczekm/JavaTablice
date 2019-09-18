package tablice;

public class Punkt {
    
   double x;
   double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double odleglosc(Punkt p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx +dy*dy);
    }
        
    void przesun(double dx, double dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    } 
    
    public Punkt(Punkt p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Punkt() {
    }
    
   /* @Override
    public String toString(){
        return "(" + this.x + "," + this.y + ")";
    } */
    
    public static Punkt srodek(Punkt p1, Punkt p2){
         
         
        double x =(p1.x + p2.x)/2.0;
        double y =(p1.y+p2.y)/2.0;
        
        Punkt p = new Punkt(x,y);
        return p;
    }   
   
      public boolean rowny(Punkt p){
      return ((this.x==p.x) && (this.y == p.y));
  }
      
   @Override
  public String toString() {
return "(" + x +
"," + y +
')';
    }
}