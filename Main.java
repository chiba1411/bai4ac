/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau4;

/**
 *
 * @author MINHNHAT
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLy = new QuanLyGiaoDich();

        quanLy.nhapDanhSachGiaoDich();
        quanLy.xuatDanhSachGiaoDich();

        int soLuongLoaiADat = quanLy.demSoLuongLoaiDat("A");
        System.out.println("Số lượng giao dịch đất loại A: " + soLuongLoaiADat);

        double trungBinhThanhTienDat = quanLy.tinhTrungBinhThanhTienDat();
        NumberFormat formatter = new DecimalFormat("#,###.##");
        System.out.println("Trung bình thành tiền giao dịch đất: " + formatter.format(trungBinhThanhTienDat));

        List<GiaoDich> giaoDichThang5Nam2023 = quanLy.timGiaoDichThang5Nam2023();
        System.out.println("Các giao dịch tháng 5 năm 2023:");
        for (GiaoDich giaoDich : giaoDichThang5Nam2023) {
            System.out.println("Mã giao dịch: " + giaoDich.maGiaoDich);
            System.out.println("Ngày giao dịch: " + giaoDich.ngayGiaoDich);
            System.out.println("-------------------------");
        }
    }
}
