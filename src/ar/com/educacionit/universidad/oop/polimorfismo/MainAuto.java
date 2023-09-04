package ar.com.educacionit.universidad.oop.polimorfismo;

import ar.com.educacionit.universidad.oop.Auto;

public class MainAuto {

	public static void main(String[] args) {

		Auto auto = new Auto("ford", "falcon", 1986, "negro", "s00001");

		auto.acelerar();// 0 +1 > 1

		System.out.println(auto.getVelocidad());

		auto.acelerar(5); // 1 +5 > 6

		System.out.println(auto.getVelocidad());
	}

}