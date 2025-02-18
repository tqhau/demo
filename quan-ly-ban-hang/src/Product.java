public class Product {
    private String id;
    private String tensanpham;
    private double gia;

    public Product(String id, String tensanpham, double gia) {
        this.id = id;
        this.tensanpham = tensanpham;
        this.gia = gia;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", tensanpham='" + tensanpham + '\'' +
                ", gia=" + String.format("̀%.0f", gia) +
                '}';
    }
}
