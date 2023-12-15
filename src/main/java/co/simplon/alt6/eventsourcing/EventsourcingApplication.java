package co.simplon.alt6.eventsourcing;

import java.util.List;
import java.util.UUID;

import co.simplon.alt6.eventsourcing.domain.DomainEvent;
import co.simplon.alt6.eventsourcing.domain.product.AddProductToCart;
import co.simplon.alt6.eventsourcing.domain.product.CreateProduct;
import co.simplon.alt6.eventsourcing.domain.product.ProductInList;
import co.simplon.alt6.eventsourcing.domain.product.PutProductOnSales;

// @SpringBootApplication
public class EventsourcingApplication {

	public static void main(String[] args) {
		DomainEvent creation = new CreateProduct(10d,"test",5, "description");
		ProductInList product = new ProductInList(
			List.of(
				creation,
				new PutProductOnSales(creation.getUuid(), 20,36000),
				new AddProductToCart(creation.getUuid(), 3, UUID.randomUUID())
				)
			);


		System.out.println(product.getLabel());
		System.out.println(product.getActive());
		System.out.println(product.getCurrentPrice());
		System.out.println(product.getQuantity());
		// SpringApplication.run(EventsourcingApplication.class, args);
	}

}
