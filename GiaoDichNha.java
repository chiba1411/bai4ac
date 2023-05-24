
package cau4;

public class GiaoDichNha extends GiaoDich {
    protected String loaiNha;
    protected String diaChi;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiNha, String diaChi, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public double tinhThanhTien() {
        if (loaiNha.equals("cao cap")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }
}
