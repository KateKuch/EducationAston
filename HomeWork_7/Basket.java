import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<String> goods;

    Basket (){
        this.goods = new ArrayList<>();
    }

    public void addGoods (String good){
        goods.add(good);
        System.out.println(good + " добавлен в корзину.");
    }

    public List<String> getGoods (){
        return goods;
    }
}
