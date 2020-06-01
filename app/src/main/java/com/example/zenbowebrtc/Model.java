package com.example.zenbowebrtc;

import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;


public class Model {


    private String id;
    private String from;
    private String fromName;
    private String to;
    private String toName;
    private SessionDescription sessionDescription;
    private IceCandidate iceCandidate;
    private int isSucceed;//1成功 2失败

    public Model() {
    }

    public Model(String id, String fromName, String from, String toName, String to) {
        this.id = id;
        this.fromName = fromName;
        this.from = from;
        this.toName = toName;
        this.to = to;
    }

    public Model(String fromName, String from, String toName, String to) {
        this.fromName = fromName;
        this.from = from;
        this.toName = toName;
        this.to = to;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public IceCandidate getIceCandidate() {
        return iceCandidate;
    }

    public void setCandidate(IceCandidate iceCandidate) {
        this.iceCandidate = iceCandidate;
    }

    public int getIsSucceed() {
        return isSucceed;
    }

    public void setIsSucceed(int isSucceed) {
        this.isSucceed = isSucceed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SessionDescription getSessionDescription() {
        return sessionDescription;
    }

    public void setSessionDescription(SessionDescription sessionDescription) {
        this.sessionDescription = sessionDescription;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
