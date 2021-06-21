/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularmouseeventqueue;

import java.util.Date;

/**
 *
 * @author A. Mjeks
 */
public class MouseEvent {
    private String event_id;
    private Date event_time;
    private String event_type;

    public MouseEvent(String event_id, Date event_time, String event_type) {
        this.event_id = event_id;
        this.event_time = event_time;
        this.event_type = event_type;
    }

    public String getEvent_id() {
        return event_id;
    }

    public Date getEvent_time() {
        return event_time;
    }

    public String getEvent_type() {
        return event_type;
    }

    @Override
    public String toString() {
        return "MouseEvent{" + "event_id=" + event_id + ", event_time=" + event_time + ", event_type=" + event_type + '}';
    }

}
