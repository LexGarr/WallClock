// WallClock Assignment
// Author: Alex Garrett
// Date: Jun 22, 2016
// Class: CS160
// Email: Lexgarr@rams.colostate.edu

public class WallClock {
	public final int hour;
	public final int minute;

	public WallClock(int _hour, int _minute) {
		this.hour = (0 < _hour && _hour < 13) ?
				_hour : 
				12;
		this.minute = (-1 < _minute && _minute < 60) ?
				_minute :
				0;
		
	}

	public WallClock(int _hour) {
		this((0 < _hour && _hour < 13) ?
				_hour : 
				12, 0);
	}

	public WallClock() {
		this(12);
	}

	public int getHour() {
		return this.hour;
	}

	public int getMinute() {
		return this.minute;
	}

	public WallClock addMinute(int minutes) {
		return new WallClock ( (this.minute + minutes) < 60 ? this.hour : ((this.hour + ((this.minute + minutes)) / 60) % 12) ,
				
							   (this.minute + minutes) < 60 ? (this.minute + minutes) : ((this.minute + minutes) % 60));
	}

	public WallClock subMinute(int minutes) {
		return new WallClock ( (this.minute - minutes) > 0 ? this.hour : ((this.hour - ((this.minute - minutes) / -60)) % 12) ,
				
							   (this.minute - minutes) > 0 ? (this.minute - minutes) : (((this.minute - minutes) % 60)) * -1);
	}
//
//	public WallClock addHour(int hours) {
//
//	}
//
//	public WallClock subHour(int hours) {
//
//	}
//
//	public double getAngle() {
//
//	}
//
//	public double getAngleDegrees() {
//
//	}
//
//	@Override
//	public boolean equals(Object other) {
//
//	}
//
	@Override
	public String toString() {
		return String.format("[%d : %02d]", this.hour, this.minute);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WallClock test = new WallClock (11, 30);
		System.out.println(test.addMinute(6000));
		System.out.println(test.subMinute(50));
		System.out.println(30-40 % 60);
		
		
	}

}
