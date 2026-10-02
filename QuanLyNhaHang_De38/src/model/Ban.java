package model;

import java.io.Serializable;

// Sử dụng record để định nghĩa thông tin chiếc bàn một cách gọn gàng
// Implement Serializable để sau này có thể lưu trạng thái xuống tệp theo yêu cầu đề bài
public record Ban(int soBan, int sucChua, boolean daDat) implements Serializable {
    
    // Tạo một phương thức phụ trợ để đổi trạng thái đặt bàn (vì record là immutable - không đổi trực tiếp được)
    public Ban datBanMoi() {
        return new Ban(this.soBan, this.sucChua, true);
    }
    
    public Ban huyDatBan() {
        return new Ban(this.soBan, this.sucChua, false);
    }
}