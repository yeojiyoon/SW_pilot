package no06;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator; 

public class BiodomeFamily06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> animalList = new ArrayList<>();
		
		animalList.add(new Animal("제니", "원숭이", "4살"));
		animalList.add(new Animal("고먀", "코끼리", "4살"));
		animalList.add(new Animal("타이", "호랑이", "9살"));
		animalList.add(new Animal("로아", "코뿔소", "5살"));
		animalList.add(new Animal("바비", "사슴", "7살"));
	
		
		Collections.sort(animalList, new Comparator<Animal>() {
            @Override
            public int compare(Animal a1, Animal a2) {
                return a1.getName().compareTo(a2.getName());
            }
        });

        for (Animal animal : animalList) {
            System.out.println(animal);
        }
		
	}

}
