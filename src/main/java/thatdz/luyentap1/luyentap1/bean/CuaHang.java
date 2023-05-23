package thatdz.luyentap1.luyentap1.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CuaHang {
    @NotNull
    @NotBlank(message = "this field must not blank")
    @Length(max = 200, min=5, message = "This field size 5 to 200 oke ")
    private String tenCH;

    @NotNull
    @NotBlank(message = "this field must not blank")
    @Length(max = 200, min=5, message = "This field size 5 to 200 oke ")
    private String diaChi;

    @NotNull(message = "this field must not blank")
    @Min(0)
    @Max(255)
    private int id;

    @Override
    public String toString() {
        return id + "  "+ tenCH + " "+ diaChi;
    }
}
