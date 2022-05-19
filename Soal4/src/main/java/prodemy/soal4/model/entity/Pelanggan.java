package prodemy.soal4.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_pelanggan")
public class Pelanggan {
    @Id
    @Column(name = "kode", length = 11)
    private String kode;
    @Column(name = "nama", length = 255)
    private String nama;
    @Column(name = "alamat", length = 255)
    private String alamat;

    @OneToMany(mappedBy = "kodePelanggan")
    private Set<Transaksi> transaksi = new HashSet<>();

    public Set<Transaksi> getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Set<Transaksi> transaksi) {
        this.transaksi = transaksi;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
