package level1.ex2.model;


import level1.ex1.model.Worker;

public class DeprecatedRemoteWorker extends Worker {
        private static final double INTERNET_PLAN = 30.0;

        public DeprecatedRemoteWorker(String name, String surname, double hourlyRate) {
            super(name, surname, hourlyRate);
        }

        @Deprecated
        public double calculateSalary(int hoursWorked) {
            return super.calculateSalary(hoursWorked) + INTERNET_PLAN;
        }
    }

