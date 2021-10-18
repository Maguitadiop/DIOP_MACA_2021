package td1.refactor.api.general;

public class BurgerAdvisor {
    private static BurgerAdvisor instance;

    private BurgerAdvisor(){}

    public static BurgerAdvisor getInstance(){
        if(instance == null){
            instance = new BurgerAdvisor();
        }
        return instance;
    }
}
