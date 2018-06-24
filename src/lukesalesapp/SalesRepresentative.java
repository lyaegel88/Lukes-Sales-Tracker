
package lukesalesapp;

/**
 *
 * @author Luke Yaegel
 */
public class SalesRepresentative {
    
        private String salesRepID;
        private String firstName;
        private String lastName;
        private String supplies = "SUPPLIES ";
        private String totalAmountSuppliesSold;
        private String books = "BOOKS ";
        private String totalAmountBooksSold;
        private String paper = "PAPER ";
        private String totalAmountPaperSold;
        private String district;
        private String contactMeans;
        
        public SalesRepresentative(String salesRepID, String firstName, String lastName, String totalAmountSuppliesSold, String totalAmountBooksSold, String totalAmountPaperSold, String district, String contactMeans){
    
            this.salesRepID = salesRepID;
            this.firstName = firstName;
            this.lastName = lastName;
            this.totalAmountSuppliesSold = totalAmountSuppliesSold;
            this.totalAmountBooksSold = totalAmountBooksSold;
            this.totalAmountPaperSold = totalAmountPaperSold;
            this.district = district;
            this.contactMeans = contactMeans;
}
        
     
        @Override
        public String toString(){
         
           return this.salesRepID + " " + this.firstName + " " + this.lastName + "\n" + "Supplies: " + this.totalAmountSuppliesSold + "\n" + "Books: " + this.totalAmountBooksSold + "\n"
                   + "Paper: " + this.totalAmountPaperSold + "\n" + this.district + "\n" + this.contactMeans.toUpperCase() + "\n \n";
            
            
            
     }

    public String getSalesRepID() {
        return salesRepID;
    }

    public void setSalesRepID(String salesRepID) {
        this.salesRepID = salesRepID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTotalAmountSuppliesSold() {
        return totalAmountSuppliesSold;
    }

    public void setTotalAmountSuppliesSold(String totalAmountSuppliesSold) {
        this.totalAmountSuppliesSold = totalAmountSuppliesSold;
    }

    public String getTotalAmountBooksSold() {
        return totalAmountBooksSold;
    }

    public void setTotalAmountBooksSold(String totalAmountBooksSold) {
        this.totalAmountBooksSold = totalAmountBooksSold;
    }

    public String getTotalAmountPaperSold() {
        return totalAmountPaperSold;
    }

    public void setTotalAmountPaperSold(String totalAmountPaperSold) {
        this.totalAmountPaperSold = totalAmountPaperSold;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getContactMeans() {
        return contactMeans;
    }

    public void setContactMeans(String contactMeans) {
        this.contactMeans = contactMeans;
    }
    
        
}
