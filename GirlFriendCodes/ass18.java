package GirlFriendCodes;

interface Fruit
 {
 
  void hasAPeel();
 
 }
 
 
  interface Vegetable
 {
 
 void hasARoot();
 
 }
 
 
class Tomato implements Fruit,Vegetable
 {
 public void hasAPeel()
 {
 System.out.println(" Peel ");
 }
 
 public void hasARoot()
 {
 
 System.out.println(" Root ");
 }
 } 
 
 
 class Ass18
 {
 public static void main(String args[])
 {
 Tomato t=new Tomato();
 t.hasAPeel();
 t.hasARoot();
 }
 }


 