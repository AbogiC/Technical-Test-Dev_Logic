package prodemy.soal4.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "t_barang")
public class Barang {
    @Id
    @Column(name = "kode", length = 255)
    private String kode;
    @Column(name = "nama", length = 255)
    private String nama;
    @Column(name = "harga", length = 255)
    private double harga;
    @OneToMany(mappedBy = "kodeBarang")
    private Set<Transaksi> transaksi = new HashSet<>();

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

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public Set<Transaksi> getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(Set<Transaksi> transaksi) {
        this.transaksi = transaksi;
    }
}
