package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> orderItens = new ArrayList<>();

	public Order() {
	}

	public Order(OrderStatus status, Client client) {
		setMoment(new Date());
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItens() {
		return orderItens;
	}

	public void addItem(OrderItem item) {
		orderItens.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}

	public Double total() {
		double soma = 0.0;
		for (OrderItem o : orderItens) {
			soma += o.subTotal(o.getQuantity(), o.getPrice());
		}

		return soma;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order status: " + getStatus() + "\n");
		sb.append("Client: " + client.toString() + "\n");
		sb.append("Order items:\n");

		for (OrderItem o : orderItens) {
			System.out.println(orderItens.toString());
		}

		sb.append("Total price: $" + total());

		return sb.toString();
	}

}
