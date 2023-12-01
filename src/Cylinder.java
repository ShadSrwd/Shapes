
public class Cylinder extends Shape {
   double area;
   private int  h;
    
    
    
    public void setH(int h) {
        
        this.h = h;
    }

    public void setArea() {
        this.area =2*3.14*(super.getRadius()*super.getRadius())+getH()*(2*3.14*(getRadius()));
    }

    public int getH() {
        return h;
    }


 
    public double getArea() {
        return area;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("Enter Height :");
       int h=i.nextInt();
        setH(h);
       
      setArea();
   }
    
    public void display(){
        super.display();
        System.out.println(getArea());
    }

   
    
}

