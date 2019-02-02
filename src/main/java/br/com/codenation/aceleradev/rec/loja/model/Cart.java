package br.com.codenation.aceleradev.rec.loja.model;

import java.sql.Date;

public class Cart {

    private int id;
    private Long userId;
    private double totalPrice;
    private int count;
    private Date hourDate;

    

    public Cart(int id, Long userId, double totalPrice, int count, Date hourDate) {
        this.id = id;
        this.userId = userId;
        this.totalPrice = totalPrice;
        this.count = count;
        this.hourDate = hourDate;
    }
    
    public int getId() {
		return id;
	}
    
    public void setId(int id) {
		this.id = id;
	}

    public Cart() {
    }


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getHourDate() {
        return hourDate;
    }

    public void setHourDate(Date hourDate) {
        this.hourDate = hourDate;
    }
}
