package no02;

import java.util.ArrayList;
import java.util.List;

public class LifeNest { //동식물을 관리
	//Organism 객체를 저장하는 organismList 리스트 필드를 가지고있다.
	private List<Organism> organismList = new ArrayList<>();
	
	//리스트에 동식물을 추가하거나 삭제하고 전체 동식물을 출력하는 메서드를 포함한다.
	public void addOrganism(String name, String species, String habitat)
	{
		organismList.add(new Organism(name, species, habitat));
		printAlert(1, name);
	}
	
	public void deleteOrganism()
	{
		printAlert(2, organismList.remove(0).getName());
	}
	
	public void editHabitat(String name, String habitat)
	{
		for (Organism item : organismList)
		{
			if(item.getName().equals(name))
			{
				item.setHabitat(habitat);
				printAlert(3, name);
			}
		}
	}
	
	public void printOrganism()
	{
		System.out.println("전체 동식물 목록 출력:");
		int i = 1;
		for (Organism item : organismList)
		{
			System.out.print(i++ + ". ");
			item.displayInfo();
		}
	}
	
	//동식물이 추가되거나 삭제 될때 수행 작업을 출력해야한다.
	public void printAlert(int flag, String name)
	{
		if(flag==1)
		{
			System.out.println("[LifeNest] " + name + "이(가) 추가되었습니다.");
		}
		else if(flag==2)
		{
			System.out.println("[LifeNest] " + name + "이(가) 삭제되었습니다.");
		}
		else if(flag==3)
		{
			System.out.println("[LifeNest] " + name + " 서식지가 변경되었습니다.");
		}
	}
}
