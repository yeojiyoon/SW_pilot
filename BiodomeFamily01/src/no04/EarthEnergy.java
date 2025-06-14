package no04;

public class EarthEnergy extends EnergySource{
	private String sourceName;
	private int energyAmount;
	
	public EarthEnergy(String sourceName, int energyAmount)
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
	//지열은 지층의 온도를 입력 받아 온도*5+20 만큼의 에너지를 생성한다.
}
