import java.util.ArrayList;

public class UsedCarLot {
    ArrayList<Car> inventory;

    public UsedCarLot(){
        inventory = new ArrayList<Car>(); 
    }

    public ArrayList<Car> getInventory(){
        return inventory;
    }

    public void addCar(Car car){
        inventory.add(car);
    }

    public boolean swap(int index1, int index2){
        if(inventory.size() <= index1 || inventory.size() <= index2){
            return false;
        }
        Car swap1 = inventory.get(index1);
        Car swap2 = inventory.get(index2);
        inventory.set(index1, swap2);
        inventory.set(index2, swap1);
        if(inventory.get(index1).equals(swap2) && inventory.get(index2).equals(swap1)){
            return true;
        }
        return false;
    }
}
