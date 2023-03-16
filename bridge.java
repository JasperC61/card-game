package bridge.example;

import java.util.ArrayList;
import java.util.Collections;

public class bridge {

	public static void main(String[] args) {
		
		ArrayList<String> poker=new ArrayList<>();
		
		String[] colors= {"♠ ","♥ ","♣ ","♦ "};
		String[] numbers= {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
		poker.add("🃟");
		poker.add("🃏");
		for(String number:numbers) {
			for(String color:colors) {
				//System.out.println(color+number);
				poker.add(color+number);
			}
		}
		//洗牌
		//System.out.println(poker);
		Collections.shuffle(poker);
		//System.out.print(poker);
		
		
		//發牌
		
		ArrayList<String> playA=new ArrayList<>();
		ArrayList<String> playB=new ArrayList<>();
		ArrayList<String> playC=new ArrayList<>();
		ArrayList<String> banker=new ArrayList<>();
		
		
		for(int i=0;i<poker.size();i++) {
			String p=poker.get(i);
			if(i>=51) {
				banker.add(p);
			}else if(i%3==0) {
				playA.add(p);
			}else if(i%3==1) {
				playB.add(p);
			}else if(i%3==2) {
				playC.add(p);
			}
		}
		
		//看牌
		
		System.out.println("米老鼠:"+playA);
		System.out.println("普魯多:"+playB);
		System.out.println("唐老鴨:"+playC);
		System.out.println("米妮:"+banker);
	}

}
