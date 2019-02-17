package sortInterface;

public class Time {

	int hours;
	int minutes;
	int seconds;

	Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int x) {
		this.hours = x;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int value) {
		this.minutes = value;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int value) {
		this.seconds = value;
	}

	public void increment() {
		seconds++;
		if (seconds > 59) {
			minutes++;
			seconds = 0;

			if (minutes > 59) {
				hours++;
				minutes = 0;
			}
			if (hours > 23) {
				hours = 0;
			}
		}

	}

	public void increment(int value) {
		seconds = seconds + value;
		int increase = seconds / 60;
		minutes = minutes + increase;
		seconds = seconds % 60;
		 
		

//		if (seconds > 59) {
//			minutes++;
//			seconds = 0;

			if (minutes > 59) {
				hours++;
				minutes = 0;
			}
			if (hours > 23) {
				hours = 0;
			}

		

	}
}
