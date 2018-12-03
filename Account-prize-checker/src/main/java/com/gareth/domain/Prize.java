package com.gareth.domain;

public class Prize {

	private String message;
	private boolean winner;

	public Prize() {
	}

	public Prize(String message, boolean winner) {
		this.message = message;
		this.winner = winner;
	}

	public String getPrize() {
		return message;
	}

	public void setPrize(String prize) {
		this.message = prize;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Prize [prize=" + message + "]";
	}
}