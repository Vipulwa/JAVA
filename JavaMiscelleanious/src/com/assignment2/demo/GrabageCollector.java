package com.assignment2.demo;
public class GrabageCollector
{
    public static void main(String[] args) throws InterruptedException
    {
        GrabageCollector t1 = new GrabageCollector();
        GrabageCollector t2 = new GrabageCollector();          
        t1 = null; 
        System.gc();
        t2 = null;
        Runtime.getRuntime().gc();
    }
    @Override
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }
}