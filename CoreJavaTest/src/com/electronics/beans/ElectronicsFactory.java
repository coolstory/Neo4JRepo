package com.electronics.beans;

public class ElectronicsFactory {
	DesktopComputer desktopComputer;
	Laptop laptop;
	Smartphone smartPhone;
	Tablet tablet;
	Object obj;
	
	private ElectronicsFactory(){}
	
	public Object deviceManufacturer(String devicetype){
		if(devicetype.equalsIgnoreCase("desktopcomputer"))
			obj= desktopComputer;
			else 
				if(devicetype.equalsIgnoreCase("Laptop"))
					obj = laptop;
					else
						if(devicetype.equalsIgnoreCase("Smartphone"))
							obj= smartPhone;
						else
							if(devicetype.equalsIgnoreCase("Tablet"))
								obj= tablet;

								return obj;
				}

		
	}


