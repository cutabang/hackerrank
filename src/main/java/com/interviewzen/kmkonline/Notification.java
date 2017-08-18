package com.interviewzen.kmkonline;

public class Notification {
	protected String receiver;
	protected boolean isRead;
	
	public Notification() {}
	
	public Notification(String receiver) {
		this.receiver = receiver;
	}

	public boolean validReceiver() {
		return receiver != null && !receiver.isEmpty();
	}
	
	public void markAsRead() {
		if (!isRead) {
			isRead=true;
		}
	}
	
    public String status()  {
    	if (isRead) {
    		return "read";
    	} else {
    		return "unread";
    	}
    }

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
}

class EmailNotification extends Notification {
	

	public EmailNotification() {}

	public EmailNotification(String receiver) {
		super(receiver);
	}

	@Override
	public String status() {
		return super.status() + "-email";
	}
}
