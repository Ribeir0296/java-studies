abstract class Employee {
    private final String name;

    Employee(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract String type();

    abstract double pay();
}

class Salaried extends Employee {
    private final double monthly;

    Salaried(String name, double monthly) {
        super(name);
        this.monthly = monthly;
    }

    String type() {
        return "Salaried";
    }

    double pay() {
        return monthly;
    }
}

class Hourly extends Employee {
    private final double rate;
    private final double hours;

    Hourly(String name, double rate, double hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    String type() {
        return "Hourly";
    }

    double pay() {
        double regularHours = Math.min(hours, 160);
        double overtimeHours = Math.max(hours - 160, 0);
        return regularHours * rate + overtimeHours * rate * 1.5;
    }
}

class Commissioned extends Employee {
    private final double baseSalary;
    private final double sales;
    private final double commissionRate;

    Commissioned(String name, double baseSalary, double sales, double commissionRate) {
        super(name);
        this.baseSalary = baseSalary;
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    String type() {
        return "Commissioned";
    }

    double pay() {
        return baseSalary + sales * commissionRate / 100;
    }
}

void main() {
    int n = Integer.parseInt(IO.readln().trim());
    List<Employee> staff = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        String[] p = IO.readln().trim().split("\\s+");
        if (p[0].equals("salaried")) {
            staff.add(new Salaried(p[1], Double.parseDouble(p[2])));
        } else if (p[0].equals("hourly")) {
            staff.add(new Hourly(p[1], Double.parseDouble(p[2]), Double.parseDouble(p[3])));
        } else if (p[0].equals("commission")) {
            staff.add(new Commissioned(
                    p[1],
                    Double.parseDouble(p[2]),
                    Double.parseDouble(p[3]),
                    Double.parseDouble(p[4])
            ));
        } else {
            throw new IllegalArgumentException("Unknown employee type: " + p[0]);
        }
    }

    double totalPayroll = 0;
    Employee topEarner = staff.get(0);
    for (Employee employee : staff) {
        double pay = employee.pay();
        totalPayroll += pay;
        IO.println(employee.getName() + " (" + employee.type() + "): "
                + String.format(java.util.Locale.US, "%.2f", pay));
        if (pay > topEarner.pay()) {
            topEarner = employee;
        }
    }
    IO.println("Total payroll: " + String.format(java.util.Locale.US, "%.2f", totalPayroll));
    IO.println("Top earner: " + topEarner.getName());
}
