package model;

public class TestSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Simulator sim = new Simulator();
		
		sim.init();
		sim.run();
		System.out.println(sim.getPatientsDead()+" Death, "+sim.getPatientsAbandoned()+" Abandoned, "+sim.getPatientsTreated()+" Treated.");

	}

}
