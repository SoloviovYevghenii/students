package restoran;

import lombok.Data;

import java.util.List;

@Data
public class Restoran {
    private List<Client> clients;
    private Hall hall;
    private Kitchen kitchen;
    private Bar bar;


}
