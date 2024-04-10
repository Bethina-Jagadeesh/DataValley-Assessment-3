class Organization implements Cloneable {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;
    
    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class OrgClone {
    public static void main(String[] args) {
        Organization org1 = new Organization(1, "ABC Corp", "123 Street, City");
        
        try {
            Organization org2 = (Organization) org1.clone();

            System.out.println("Details of Organization 1:");
            org1.printDetails();

            System.out.println("\nDetails of Organization 2 (Cloned from Organization 1):");
            org2.printDetails();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
