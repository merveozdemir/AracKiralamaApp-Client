import src.service.AracDto;
import src.service.AracService;
import src.service.AracServiceImplService;

import java.util.List;

public class AracTest {
    public static void main(String[] args) {
        AracDto aracDto = new AracDto();
        aracDto.setAracModel("Reno2");
        aracDto.setAracMarka("Reno2");
        aracDto.setKoltukSayisi(5);

        AracServiceImplService aracServiceImplService = new AracServiceImplService();
        aracServiceImplService.getAracServicePort().saveArac(aracDto);
    }
}
