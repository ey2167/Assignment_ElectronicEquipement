/**
 * Elohe Yonas
 * project ElectricEquipment will be using the ElecEquip Class as the super class.
 * the properties for ElecEquip will be device, weight, cost, power usage, and manufacturers
 * the properties will be initialized and put as constructors in the ElecEquip Class
 * the sub classes to test the ElecEquip Class will be Tv, Phone, and Computer
 *class ElecDriver will test the properties of above classes
 */
public class ElecEquip {
private String device;
private double weight;
private double cost;
private double powerusage;
private String manufacturers;
protected ElecEquip(){
	
}
protected ElecEquip(String device, double weight, double cost, double powerusage, String manufacturers){
	this.device = device;
	this.weight = weight;
	this.cost = cost;
	this.powerusage = powerusage;
	this.manufacturers = manufacturers;
}
public String toString(){
	return "this is a " + device + ". the weight of this device is usually " + weight + " lbs. the cost for this item is on average " + cost
			+ " dollars. this device on average uses " + powerusage + " watts of power. the manufacturers are usually companies like " + manufacturers;
}
}
