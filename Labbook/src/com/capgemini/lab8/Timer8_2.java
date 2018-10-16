package com.capgemini.lab8;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Timer8_2 {
	public static void main(String[] args) {
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("timer refreshed after every 10 seconds");
				
			}
			
		};
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(r, 0, 10,TimeUnit.SECONDS );
	}
}


