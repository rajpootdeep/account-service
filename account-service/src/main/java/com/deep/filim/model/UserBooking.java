package com.deep.filim.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity
public class UserBooking {

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;

	private Long showId;

	private byte quantity;

	private String Status;

//	@ManyToOne(fetch = FetchType.LAZY) //cascade = { CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST, CascadeType.REFRESH})
//	@JoinColumn(name="user_id")
//	private User user;

	public Long getBookingId() {
		return bookingId;
	}

	public Long getShowId() {
		return showId;
	}

	public byte getQuantity() {
		return quantity;
	}

	public String getStatus() {
		return Status;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public void setQuantity(byte quantity) {
		this.quantity = quantity;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
