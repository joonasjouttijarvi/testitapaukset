import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class TilaustenKasittelyMockitoTest {
    @Mock
    IHinnoittelija hinnoittelijaMock;

    TilaustenKasittely kasittelija;
    Asiakas asiakas;
    Tuote tuote;
    float alkuSaldo;
    float listaHinta;
    float alennus;
    float loppuSaldo;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        kasittelija = new TilaustenKasittely();
        kasittelija.setHinnoittelija(hinnoittelijaMock);
        alkuSaldo = 100.0f;
        listaHinta = 30.0f;
        alennus = 20.0f;
        loppuSaldo = alkuSaldo - (listaHinta * (1 - alennus / 100));
        asiakas = new Asiakas(alkuSaldo);
        tuote = new Tuote("TDD in Action", listaHinta);
    }

    @Test
    public void testaaKasittelijaHinnoittelija() {
        // Arrange
        when(hinnoittelijaMock.getAlennusProsentti(asiakas, tuote)).thenReturn(alennus);

        // Act
        kasittelija.käsittele(new Tilaus(asiakas, tuote));

        // Assert
        assertEquals(loppuSaldo, asiakas.getSaldo(), 0.001);
        verify(hinnoittelijaMock, times(2)).getAlennusProsentti(asiakas, tuote);
    }
}