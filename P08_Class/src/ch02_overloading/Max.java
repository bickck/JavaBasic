package ch02_overloading;

public class Max {

	int max(int dataA, int dataB) {
		return (dataA > dataB) ? dataA : dataB;
	}

	double max(double dataA, double dataB) {
		return (dataA > dataB) ? dataA : dataB;
	}
}
