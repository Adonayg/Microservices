package com.adonayg.domain;

public class Prize {

	private String message;
	private boolean winner;

	public Prize() {
	}

	public Prize(String message, boolean winner) {
		this.message = message;
		this.winner = winner;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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