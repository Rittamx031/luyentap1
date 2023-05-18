package thatdz.luyentap1.luyentap1.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuaHang {
    private String tenCH,diaChi;
    private int id;

    @Override
    public String toString() {
        return id + "  "+ tenCH + " "+ diaChi;
    }
}
