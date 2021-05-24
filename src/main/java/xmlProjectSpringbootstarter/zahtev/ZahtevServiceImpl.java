package xmlProjectSpringbootstarter.zahtev;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ZahtevServiceImpl implements ZahtevService{

    @Autowired
    private ZahtevRepository porukaRepository;

    @Override
    public Zahtev newPoruka(Zahtev poruka) {

    	return poruka;
    }
}
