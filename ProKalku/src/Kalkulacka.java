
public class Kalkulacka {

	private double cislo1, cislo2;

	public double getCislo1() {
		return cislo1;
	}

	public void setCislo1(double cislo1) {
		this.cislo1 = cislo1;
	}

	public double getCislo2() {
		return cislo2;
	}

	public void setCislo2(double cislo2) {
		this.cislo2 = cislo2;
	}

	public Kalkulacka() {
		super();
	}

	public Kalkulacka(double cislo1, double cislo2) {
		super();
		this.cislo1 = cislo1;
		this.cislo2 = cislo2;
	}

	public double Secti() {
		return cislo1 + cislo2;
	}

	public double Odecti() {
		return cislo1 - cislo2;
	}

	public double Vynasob() {
		return cislo1 * cislo2;
	}

	public double Vydel() {
		return cislo1 / cislo2;
	}

	public double MocninaC1() {
		return cislo1 * cislo1;
	}

	public double MocninaC2() {
		return cislo2 * cislo2;
	}

	public double OdmocninaC1() {
		return Math.sqrt(cislo1);
	}

	public double OdmocninaC2() {
		return Math.sqrt(cislo2);
	}

	@Override
	public String toString() {
		return " Cislo1: " + getCislo1() + "\n" + " Cislo2: " + getCislo2() + "\n" + "\n" + " Soucet: " + Secti() + "\n"
				+ "\n" + " Rozdíl: " + Odecti() + "\n" + "\n" + " Násobek: " + Vynasob() + "\n" + "\n" + " Podíl: "
				+ Vydel() + "\n" + "\n" + " MocninaCisla1: " + MocninaC1() + "\n" + "\n" + " MocninaCisla2: "
				+ MocninaC2() + "\n" + "\n" + " OdmocninaCisla1: " + OdmocninaC1() + "\n" + "\n" + " OdmocninaCisla2: "
				+ OdmocninaC2();
	}

}
