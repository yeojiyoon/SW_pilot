package no04;

public class SunEnergy extends EnergySource{
	private String sourceName;
	private int energyAmount;

	public SunEnergy(String sourceName, int energyAmount)
	{
		this.sourceName = sourceName;
		this.energyAmount = energyAmount;
	}
	
	@Override
	public void useEnergy() {
		// TODO Auto-generated method stub
		
	}

	//태양광은 일조 시간을 입력 받아 시간_10 만큼의 에너지를 생성한다._

	@Override
	public void produceEnergy(int num) {
		// TODO Auto-generated method stub
		
	}
}
