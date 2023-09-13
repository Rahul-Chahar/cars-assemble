public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRateperHour() method");
        double rate = 0.0;
        if (speed == 0) {
            rate = 0.0;
        } else if (speed >= 1 && speed <= 4) {
            rate = speed * 221.0;
        } else if (speed >= 5 && speed <= 8) {
            rate = speed * 221.0 * 0.9;
        } else if (speed == 9) {
            rate = speed * 221.0 * 0.8;
        } else if (speed == 10) {
            rate = speed * 221.0 * 0.77;
        }
        return rate;

    }

    public int workingItemsPerMinute(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        return (int) productionRatePerHour(speed) / 60;
    }

}
