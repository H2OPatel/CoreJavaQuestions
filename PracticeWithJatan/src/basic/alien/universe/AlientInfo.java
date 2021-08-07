package basic.alien.universe;

public class AlientInfo {
	
	private int alienId;
	private String planetName;
	private String galaxyName;
	private int earthId;
	public AlientInfo(int alienId, String planetName, String galaxyName, int earthId) {
		super();
		this.alienId = alienId;
		this.planetName = planetName;
		this.galaxyName = galaxyName;
		this.earthId = earthId;
	}
	public int getAlienId() {
		return alienId;
	}
	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	public String getGalaxyName() {
		return galaxyName;
	}
	public void setGalaxyName(String galaxyName) {
		this.galaxyName = galaxyName;
	}
	public int getEarthId() {
		return earthId;
	}
	public void setEarthId(int earthId) {
		this.earthId = earthId;
	}
	@Override
	public String toString() {
		return "AlientInfo [alienId=" + alienId + ", planetName=" + planetName + ", galaxyName=" + galaxyName
				+ ", earthId=" + earthId + "]";
	}
	
	
	

}
