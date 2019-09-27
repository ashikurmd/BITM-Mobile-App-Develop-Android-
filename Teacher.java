
package oop;


public class Teacher {
   
    String name, gender;
    int age;
    
    
    Teacher (){
        
        System.out.println(" No Value");
    }
    
    Teacher(String n,String m, int a){
        
        name= n;
        gender=m;
        age=a;
        
    }



    
    void displayInformation(){
        
        System.out.println(" Nmae:" + name);
        System.out.println(" Gender:" + gender);
        System.out.println(" Age:" + age);
    
    }
    
}
