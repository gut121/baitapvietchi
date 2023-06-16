/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai_tap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Collections;

public class bai_tap {
    public static void main(String[] args) {
        List<Integer> danhSach = new LinkedList<>();
        String fileName = "E:\\solieu.txt";

        // Đọc file và thêm vào danh sách
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                danhSach.add(Integer.parseInt(line.trim()));
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
            return;
        }

        // Tính tổng các nốt lẻ
        int tongLe = danhSach.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println("Tổng các số lẻ: " + tongLe);

        // Tính trung bình cộng các số chẵn
        double trungBinhChan = danhSach.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Trung bình cộng các số chẵn: " + trungBinhChan);

        // Đếm số phần tử lớn hơn 3 trong danh sách
        long countLonHon3 = danhSach.stream().filter(number -> number > 3).count();
        System.out.println("Số phần tử lớn hơn 3: " + countLonHon3);

        // Đếm số phần tử khác nhau trong danh sách
        Set<Integer> set = new HashSet<>(danhSach);
        int countPhanTuKhacNhau = set.size();
        System.out.println("Số phần tử khác nhau: " + countPhanTuKhacNhau);

        // Hoán vị phần tử đầu và phần tử cuối trong danh sách
        if (danhSach.size() >= 2) {
            Collections.swap(danhSach, 0, danhSach.size() - 1);
            System.out.println("Danh sách sau khi hoán vị phần tử đầu và phần tử cuối: " + danhSach);
        }

        // In giá trị nốt kế cuối trong danh sách
        if (danhSach.size() >= 2) {
            int valueNotKeCuoi = danhSach.get(danhSach.size() - 2);
            System.out.println("Giá trị kế cuối trong danh sách: " + valueNotKeCuoi);
        }

        // Đảo danh sách liên kết
        Collections.reverse(danhSach);
        System.out.println("Danh sách sau khi đảo: " + danhSach);
    }
}

