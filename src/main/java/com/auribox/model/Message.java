package com.auribox.model;

public class Message {
	
	private String header;
	private String payload;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}
	
	public Message(String header) {
		this.header=header;
		
	}
	
	public void initMethodIsra() {
		System.out.println("Dentro del metodo initMethod");
	}
	
	public void closeMethodIsra() {
		System.out.println("Close - Dentro del metodo initMethod");
	}
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	@Override
	public String toString() {
		return "Message [header=" + header + ", payload=" + payload + "]";
	}
	
	
}
