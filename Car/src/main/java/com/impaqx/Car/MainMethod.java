package com.impaqx.Car;

import java.util.Scanner;


public class MainMethod {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("there is a two TYPES car like lamborghini and Farrari which car you want");
		String whichcar = scan.nextLine();
		System.out.println("enter the car name to get a details of that[LamborghiniBaseCar or"
				+ " LamborghiniTopVerent or LamborghiniAutomatic or farraribasecar or farraritopverent");
		String carname = scan.nextLine();
		LamborghiniObjects lobject = new LamborghiniObjects();
		FarrariObjects fobject = new FarrariObjects();
		System.out.println("--------***--------");

		if (carname.equalsIgnoreCase("lamborghinibasecar")) {
			Icar basecarobject = lobject.Objects(carname);
			basecarobject.charr(whichcar);
			basecarobject.engine(whichcar);
			((LamborghiniBaseCar) basecarobject).baseVerent(whichcar);
			System.out.println("--------***--------");

		} else if (carname.equalsIgnoreCase("lamborghinitopverent")) {
			Icar topcarobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			topcarobject.charr(whichcar);
			topcarobject.engine(whichcar);
			((LamborghiniTopVerent) topcarobject).topVerent(whichcar);
			System.out.println("---------*****--------");
		} else if (carname.equalsIgnoreCase("lamborghiniautomatic")) {

			Icar autoobject = lobject.Objects(carname);
			System.out.println("---------*****------");
			autoobject.charr(whichcar);
			autoobject.engine(whichcar);
			System.out.println("---------*****------");

		} else if (carname.equalsIgnoreCase("farraribasecar")) {
			Icar fbasecarobject = fobject.object(carname);
			System.out.println("--------****----------");
			fbasecarobject.charr(whichcar);
			fbasecarobject.engine(whichcar);
			((FarrariBaseCar) fbasecarobject).baseverentfetures(whichcar);
			System.out.println("--------****--------");

		} else if (carname.equalsIgnoreCase("Farraritopverent")) {
			Icar ftopcarobject = fobject.object(carname);
			ftopcarobject.charr(whichcar);
			ftopcarobject.engine(whichcar);
			((FarrariTopVerent) ftopcarobject).topEndFetures(whichcar);
		} else {
			System.out.println("plese enter the valid car name");

		}
		scan.close();

	}

}
