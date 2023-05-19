package thatdz.luyentap1.luyentap1.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuaHang {
    @NotBlank(message = "is required")
    private String tenCH;

    @NotBlank(message = "is required")
    private String diaChi;
    
    @NotNull(message = "is required")
    private int id;

    @Override
    public String toString() {
        return id + "  "+ tenCH + " "+ diaChi;
    }
}
