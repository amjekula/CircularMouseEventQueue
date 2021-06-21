/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularmouseeventqueue;

/**
 *
 * @author A. Mjeks
 */
public class MyQueue {
    private MouseEvent[] data;
    private int rear, front, count;

    public MyQueue() {
        data = new MouseEvent[5];
        rear = 0;
        front = 0;
        count = 0;
    }
    
    public boolean isEmpty(){
        return(count == 0);
    }
    
    public boolean isFull(){
        if(rear == front && count == data.length && count > 0){
            return true;
            
        }else{
            return false;
        }
    }
    
    public void enqueue(MouseEvent value){
        data[rear] = value;
        rear = (rear + 1) % data.length;
        count++;
    }
    
    public MouseEvent dequeue(){
        MouseEvent value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }
}
