package td1.refactor.api.macdeau;

public class MacdeauRestaurant implements BurgerRestaurant{

    public static MacdeauRestaurant instance;

    public MacdeauRestaurant(){}

    public static MacdeauRestaurant getInstance(){
        if(instance == null){
            instance = new MacdeauRestaurant();
        }
        return instance;
    }
    
    public MacdeauRestaurant queue(){

    }

    public BurgerCook order_menu(MenuType menu){
        
    }
    public BurgerCook order_personal(Size size, MeatType type){

    }



}