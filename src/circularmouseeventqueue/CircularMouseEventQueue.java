/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularmouseeventqueue;

import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author A. Mjeks
 */
public class CircularMouseEventQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue myQueue = new MyQueue();
        String event_id = UUID.randomUUID().toString();
        Date date = new Date();

        MouseEvent mouseEvent1 = new MouseEvent(event_id, date, "double Click");
        MouseEvent mouseEvent2 = new MouseEvent(event_id, date, "single Click");
        MouseEvent mouseEvent3 = new MouseEvent(event_id, date, "single Click");
        MouseEvent mouseEvent4 = new MouseEvent(event_id, date, "double Click");
        MouseEvent mouseEvent5 = new MouseEvent(event_id, date, "single Click");

        System.out.println("Is Empty? " + myQueue.isEmpty());

        myQueue.enqueue(mouseEvent1);
        myQueue.enqueue(mouseEvent2);
        myQueue.enqueue(mouseEvent3);
        myQueue.enqueue(mouseEvent4);
        myQueue.enqueue(mouseEvent5);

        System.out.println("Is Full? " + myQueue.isFull());

        for (int x = 0; x < 6; x++) {
            System.out.println(myQueue.dequeue());
        }
    }
    
    public static void createDialog(Button b, final String message) {
        //                                    ^^^^^
        MouseListener mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent mouseEvent) {
                if (SwingUtilities.isLeftMouseButton(mouseEvent)) {
                    JOptionPane.showConfirmDialog(null,
                            message, message, JOptionPane.YES_NO_OPTION);
                }
            }
        };
    }

}
