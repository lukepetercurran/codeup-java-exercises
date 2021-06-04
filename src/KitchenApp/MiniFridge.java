package KitchenApp;

public class MiniFridge  extends Refrigerator implements StoreFood{
    public MiniFridge(String type, String brandName){
        super(type, brandName);
    }

    public void keepFresh(){

    }
}
