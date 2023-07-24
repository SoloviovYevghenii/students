package restoran;

import lombok.Data;

import java.util.List;

@Data
public class Hall {

    private List<Integer> tables;

    public List<Integer> getTables() {
        return tables;
    }

    public void setTables(List<Integer> tables) {
        this.tables = tables;
    }
}
