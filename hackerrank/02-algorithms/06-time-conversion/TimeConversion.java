class TimeConversion {
	public static void main(String[] args) {
		String time = "12:05:45AM";

		int hr = Integer.parseInt(time.substring(0,2));
		String minSec = time.substring(2,8);
		String amPm = time.substring(8,9);
		int hr24 = 0;
		String s24 = null;

		if (amPm.equals("A")) {
			if (hr == 12) {
				s24 = "00" + minSec;
			} else if (hr != 12) {
				if (hr < 10) {
					s24 = "0" + hr + minSec;
				} else if (hr == 10 || hr == 11) {
					s24 = hr + minSec;
				}
			}
		} else if (amPm.equals("P")) {
			if (hr == 12) {
				s24 = hr + minSec;
			} else if (hr != 12) {
				hr24 = hr + 12;
				s24 = Integer.toString(hr24) + minSec;
			}
		}

		System.out.println(s24);
	}
}
