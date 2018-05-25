package com.junlianglin.groupon;

import com.junlianglin.groupon.domain.Product;
import com.junlianglin.groupon.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private ProductService productService;

	@Test
	public void contextLoads() {
		Page<Product> productList =  productService.findProductList(1,5);
		System.out.println(productList.getTotalElements());
	}

}
