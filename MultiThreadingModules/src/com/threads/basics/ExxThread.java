package com.threads.basics;
class Child extends Thread{
    public Child(String name,int priority) {
        super(name);
        System.out.println(this);
//        this.start();
    }
    //this is the cpu
    @Override
    public void run(){
        for (int i=1; i<=10; i++){
            String name = Thread.currentThread().getName();
            System.out.println(i+"x"+i +" = "+(i*5)+"****** "+name);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


    }
}



public class ExxThread {
    public static void main(String[] args) {
        Child child1 = new Child("child-one",10);
//        child1.setName("child-one");
//        System.out.println(child1);
//        child1.start();
        Child child2 = new Child("child-two",6);
        Child child3 = new Child("child-three",8);
        child3.setDaemon (true);
        child3.start();
//        child2.setName("child-two");
//        System.out.println(child2);
//        child2.start();
        System.out.println();
        for (int i=1; i<10; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("6 * " + i + " = " + (i * 6) + "******** " + name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                child1.join();
                child2.join();
                child3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("main completed");
        }
    }

