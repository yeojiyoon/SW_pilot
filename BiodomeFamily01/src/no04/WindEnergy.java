package no04;

public class WindEnergy extends EnergySource{
	private String sourceName;
	private int energyAmount;
	
	public WindEnergy(String sourceName, int energyAmount)
	{
		this.sourceName = sourceName;
		this.energyAmount = energyAmount;
	}
	
	@Override
	public void useEnergy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void produceEnergy(int num) {
		// TODO Auto-generated method stub
		
	}
	//_풍력은 바람의 속도를 입력 받아 속도_5 만큼의 에너지를 생성한다.
}
