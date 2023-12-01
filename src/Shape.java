import java.util.Scanner;

public class Shape {
   private String color;
   private double radius;
    Scanner i=new Scanner (System.in);

    
    public Shape(){
        
    }
    
    public Shape(String color, Double radius) {
        this.color = color;
        this.radius = radius;
    }
    
    
   

    public String getColor() {
        return color;
    }

    public Double getRadius() {
        return radius;
    }
    
    
     public void input(){
        
         System.out.println("Enter color: ");
       this.color=i.nextLine();
         
         System.out.println("Enter radius: ");
       this.radius=i.nextDouble();
     }
   
     public void display(){
         System.out.println("Color\t\tarea"); 
         System.out.println("*********\t*******");
         System.out.print(getColor()+"\t\t");
     }
     
     
     
     
     
     
     
     
     
     
     
}
