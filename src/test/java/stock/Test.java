package stock;

import com.lab.ocp.day07.stock.dao.StockDao;
import com.lab.ocp.day07.stock.po.Stock;
import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test_StockDao() {
        StockDao dao = StockDao.getInstance();
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks).forEach(s -> System.out.println(s.get證券名稱()));
    }
}
