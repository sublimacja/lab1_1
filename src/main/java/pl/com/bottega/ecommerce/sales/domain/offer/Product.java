package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

    private String Id;
    private String Type;
    private String Name;
    private Date SnapshotDate;
    private Money Price;

    public Product(String id, String type, String name, Date snapshotDate,Money price) {
        this.Id = id;
        this.Type = type;
        this.Name = name;
        this.SnapshotDate = snapshotDate;
        this.Price=price;
    }

    public Money getPrice() {
        return Price;
    }

    public String getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }

    public Date getSnapshotDate() {
        return SnapshotDate;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + (Name == null ? 0 : Name.hashCode());
        result = prime * result + (Id == null ? 0 : Id.hashCode());
        result = prime * result + (Type == null ? 0 : Type.hashCode());
        return result;
    }

    public boolean sameAs(Product other) {
        if (Name == null) {
            if (other.Name != null) {
                return false;
            }
        } else if (!Name.equals(other.Name)) {
            return false;
        }

        if (Id == null) {
            if (other.Id != null) {
                return false;
            }
        } else if (!Id.equals(other.Id)) {
            return false;
        }

        if (Type == null) {
            if (other.Type != null) {
                return false;
            }
        } else if (!Type.equals(other.Type)) {
            return false;
        }

        return true;
    }
}
