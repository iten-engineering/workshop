package meteo.m7;

import java.util.List;

public interface Kenntage {

	public boolean isTropenNacht();

	public boolean isVegetationsTag();

	public boolean isFrostTag();

	public boolean isHeizTag();

	public boolean isWuestenTag();

	public boolean isHeisserTag();

	public boolean isSommerTag();

	public boolean isEisTag();

	public List<Kenntag> getKenntage();

}
