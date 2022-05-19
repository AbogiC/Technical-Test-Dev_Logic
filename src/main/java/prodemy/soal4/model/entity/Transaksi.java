package prodemy.soal4.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_transaksi")
public class Transaksi {
    @Id
    @Column(name = "kode", length = 255)
    private String kode;
    @Column(name = "tanggal")
    private Date tanggal;
    //kode pelanggan
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kode_pelanggan", referencedColumnName = "kode")
    private Pelanggan kodePelanggan;
    //kode barang
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "kode_barang", referencedColumnName = "kode")
    private Barang kodeBarang;
    @Column(name = "jumlah_barang")
    private double jumlah_barang;


}
