package com.dbs.edsf.elasticsearch.entity;

public class MetastoreEvent {
    String timestamp;
    String logmessage;
    String loglevel;
    String classname;
    String pcthread;
    String action;
    String event;


    public String getLoglevel() {
        return loglevel;
    }

    public void setLoglevel(String loglevel) {
        this.loglevel = loglevel;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getPcthread() {
        return pcthread;
    }

    public void setPcthread(String pcthread) {
        this.pcthread = pcthread;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }



    public String getTimeStamp() {
        return timestamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timestamp = timeStamp;
    }

    public String getLogMessage() {
        return logmessage;
    }

    public void setLogMessage(String logMessage) {
        this.logmessage = logMessage;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MissedEvent{");
        sb.append("timestamp='").append(timestamp).append('\'').append(',');
        sb.append("logMessage='").append(logmessage).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
