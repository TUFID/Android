package com.mylaptop

object LaptopData {
    private val laptopNames =arrayOf("Acer Aspire E5-473G-76RT",
        "Acer Chromebook 514",
        "Apple Macbook Pro",
        "ASUS ROG Zephyrus G14",
        "ASUS ROG ZEPHYRUS S",
        "ASUS TUF Gaming ",
        "ASUS VivoBook A442UQ",
        "ASUS X550IU",
        "Dell Vostro 5470",
        "HP Chromebook",
        " Huawei Matebook 13",
        "Xiaomi Mi Notebook Air")


    private val laptopDetails = arrayOf("Minimalis, bodi cukup ramping, ringan, dan praktis, itulah kesan yang dihadirkan lewat tampilan laptop murah Acer Aspire E5-473G-76RT.",
        "Laptop Acer Chromebook 514 merupakan versi laptop murah dengan kualitas tinggi yang diproduksi oleh Acer.",
        "Salah satu seri terbaik laptop ini ialah Apple Macbook Pro.",
        "ASUS ROG Zephyrus G14 ini memiliki procesor AMD Ryzen 7 4800HS layar 14-inch RAM up to 32GB SSD 512GB/1TB GPU NVIDIA GeForce RTX 2060 dan OS Windows 10 Home/Pro.",
        "Satu lagi seri ROG Zephyrus S dengan desain mewah dan performa luar biasa.",
        "Di kelas laptop gaming sendiri, harga laptop ASUS TUF Gaming FX505 ini termasuk yang termurah namun dengan kualitas yang setara.",
        "ASUS  menawarkan laptop ASUS VivoBook A442UQ yang dihargai kurang dari 10 juta rupiah, atau harga laptop ini tepatnya Rp8.999.000.",
        "Kalau kamu ingin lebih spesifik laptop untuk bermain game, maka merk laptop terbaik yang harus dipilih adalah ASUS X550IU.",
        "Dell merupakan salah satu produsen laptop terbaik yang mengeluarkan berbagai pilihan laptop dengan harga yang cukup terjangkau.",
        "Salah satu tipe laptop terbaik dari HP ialah HP Chromebook.",
        "Bagi para pecinta laptop dengan ukuran tipis dan minimalis, Huawei Matebook 13 adalah pilihan yang tepat.",
        "Produsen Xiaomi ternyata tak hanya menawarkan produk ponsel saja karena mereka pun punya laptop andalan yaitu Xiaomi Mi Notebook Air.")

    private val laptopImages = intArrayOf(R.drawable.acer_aspire_e5_473g_76rt,
        R.drawable.acer_chromebook_514,
        R.drawable.apple_macbook_pro,
        R.drawable.asus_rog_zephyrus_g14,
        R.drawable.asus_rog_zephyrus_s,
        R.drawable.asus_tuf_gaming,
        R.drawable.asus_vivobook_a442uq,
        R.drawable.asus_x550iu,
        R.drawable.dell_vostro_5470,
        R.drawable.hp_chromebook,
        R.drawable.huawei_matebook_13,
        R.drawable.xiaomi_mi_notebook_air)

    val listData: ArrayList<Laptop>
        get() {
            val list = arrayListOf<Laptop>()
            for (position in laptopNames.indices) {
                val laptop = Laptop ()
                laptop.name = laptopNames[position]
                laptop.detail = laptopDetails[position]
                laptop.photo = laptopImages[position]
                list.add(laptop)
            }
            return list
        }

}