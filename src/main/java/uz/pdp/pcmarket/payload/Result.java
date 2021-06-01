package uz.pdp.pcmarket.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {
    private String message;
    private boolean success;
    private Long fileId;

    public Result(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
}
