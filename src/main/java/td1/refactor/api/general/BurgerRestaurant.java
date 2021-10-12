package td1.refactor.api.bigburger;

public interface BurgerRestaurant {

    public BurgerCook order_menu(MenuType menu);
    public BurgerCook order_personal(Size size, MeatType type);

}