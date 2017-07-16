**Açıklamalar : **

* pkJoinColumns ile tabloların hangi kolonlar vasıtasıyla birbirine bağlanacağını belirtebiliriz.

pkJoinColumns = {
    @PrimaryKeyJoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
}

üstteki tanımlama ile PRODUCT_CATEGORY3 tablosundaki PRODUCT_ID   kolonu ile  PRODUCT3  tablosundaki ID kolonunu map etmiş olduk. 
Diğer tanımlamaların tanımı ve örneği  aşağıdadır : 


*  @Table(name = <Tablo_Adı>)
@Table(name = "PRODUCT3")


*   @Column(name=<Kolon_Adi>)
@Column(name="COUNT")



