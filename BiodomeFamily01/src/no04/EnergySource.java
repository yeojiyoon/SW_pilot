package no04;

public abstract class EnergySource {
	/*	abstract 키워드를 사용해 추상 클래스를 생성한다.
		
		모든 에너지 원천은 sourceName 을 필드로 가지며, 한번 정해진 이름은 변경할 수 없다.
		
		모든 에너지 원천은 energyAmount 를 필드로 가진다.
		
		모든 에너지 원천은 에너지를 소모하는 useEnergy() 메소드를 가진다.
		
		모든 에너지 원천은 조건에 따라 에너지를 생산하는 produceEnergy() 추상 메서드를 가진다
	 */
	String sourceName;
	int energyAmount;
	
	abstract public void useEnergy();
	abstract public void produceEnergy(int num);
}
