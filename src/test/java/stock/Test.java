package stock;

import com.lab.ocp.day07.stock.dao.StockDao;
import com.lab.ocp.day07.stock.po.Stock;
import com.lab.ocp.day07.stock.service.StockService;
import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void test_StockDao() {
        StockDao dao = StockDao.getInstance();
        Stock[] stocks = dao.getStocks();
        Arrays.stream(stocks).forEach(s -> System.out.println(s.get證券名稱()));
    }
    
    @org.junit.Test
    public void test_StockService() {
        StockService service = new StockService();
        service.find本益比(10);
        service.findBestBuy(7, 10);
    }
}
