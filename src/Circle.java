
public class Circle extends Shape {
   private double area;
    
    public Circle(){
        
    }

    public Circle(double area) {
        this.area = area;
    }

 public void setArea() {
        this.area =super.getRadius()*super.getRadius()*3.14;
       
    }

 
    public double getArea() {
        return area;
    }
    
    
    public void input(){
        super.input();
        setArea();
    }
    
    public void display(){
        super.display();
      
        System.out.println(getArea());
    }
    
    
}
