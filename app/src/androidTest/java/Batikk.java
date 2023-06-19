import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "batikk")
public class Batikk {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nama;
    private String teknik;

    //Buat constructor
    public Batikk(String nama, String teknik) {
        this.nama = nama;
        this.teknik = teknik;
    }
    //Buat getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTeknik() {
        return teknik;
    }

    public void setTeknik(String teknik) {
        this.teknik = teknik;
    }
}