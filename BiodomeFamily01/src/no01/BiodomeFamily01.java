package no01;

public class BiodomeFamily01 {

	public static void main(String[] args) {
		LifeNest admin = new LifeNest();
		
		admin.addOrganism("펭귄", "동물", "남극");
		admin.addOrganism("코알라", "동물", "호주");
		admin.addOrganism("선인장", "식물", "사막");
		admin.addOrganism("페퍼민트", "식물", "정원");
		
		admin.printOrganism();
		
		admin.deleteOrganism();
		admin.deleteOrganism();
		
		admin.printOrganism();
	}

}
