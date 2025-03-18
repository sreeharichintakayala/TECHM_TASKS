package Training;
import java.util.Scanner;

class Phone {
    private int phoneId;
    private String os;
    private String brand;
    private int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(int phoneId) {
        this.phoneId = phoneId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Assignments7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Phone[] phones = new Phone[4];

        for (int i = 0; i < 4; i++) {
            int phoneId = scanner.nextInt();
            String os = scanner.next();
            String brand = scanner.next();
            int price = scanner.nextInt();
            phones[i] = new Phone(phoneId, os, brand, price);
        }

        String brand = scanner.next();
        String os = scanner.next();

        int totalPrice = findPriceForGivenBrand(phones, brand);
        if (totalPrice > 0) {
            System.out.println(totalPrice);
        } else {
            System.out.println("The given Brand is not available");
        }

        Phone phone = getPhoneIdBasedOnOs(phones, os);
        if (phone != null) {
            System.out.println(phone.getPhoneId());
        } else {
            System.out.println("No phones are available with specified os and price range");
        }

        scanner.close();
    }

    public static int findPriceForGivenBrand(Phone[] phones, String brand) {
        int sum = 0;
        for (Phone phone : phones) {
            if (phone.getBrand().equalsIgnoreCase(brand)) {
                sum += phone.getPrice();
            }
        }
        return sum;
    }

    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os) {
        for (Phone phone : phones) {
            if (phone.getOs().equalsIgnoreCase(os) && phone.getPrice() >= 50000) {
                return phone;
            }
        }
        return null;
    }
}