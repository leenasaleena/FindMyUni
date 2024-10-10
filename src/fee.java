public class fee {
    private double tuitionFee;
    private double registrationFee;
    private double hostelFee;
    private double miscellaneousFee;
    private scholarships scholarship;

    //constructor

    public fee(double tuitionFee, double registrationFee,
               double hostelFee, double miscellaneousFee, scholarships scholarship) {
            this.tuitionFee = tuitionFee;
            this.registrationFee = registrationFee;
            this.hostelFee = hostelFee;
            this.miscellaneousFee = miscellaneousFee;
            this.scholarship = scholarship;
    }

    public double calculateTotalFee() {
        return tuitionFee + hostelFee + miscellaneousFee;
    }

    public double calculateFeeAfterScholarship() {
        double totalFee = calculateTotalFee();

        if (scholarship != null) {
            if (scholarship.isPercentage()) {
                double discount = (scholarship.getAmount() / 100) * totalFee;
                totalFee -= discount;  // Apply percentage discount
            } else {
                totalFee -= scholarship.getAmount(); // Apply fixed amount discount
            }
        }

        return totalFee;
    }

}

