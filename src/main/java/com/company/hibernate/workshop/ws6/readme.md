# Açıklamalar : #

* @ManyToMany anotasyonu ile iki tablo birbirine bağlanır. Ancak @ManyToMany isminden de anlaşılacağı gibi
 A tablosundaki birden fazla kaydı B tablosundaki yine birden falza kayıtla ilişkilendirilir.
 
 ÖRN: 
 Kitapları aşağıdaki gibi kategorilendirdiğimiz varsayarsak.
  Java Öğreniyorum kitabı hem yazılım hemde teknoloji  kategorisinde bulunabilir.
 
 Java öğreniyorum --> Teknoloji
 Java Öğreniyorum  --> Yazılım
 
 yada aynı kategoride birden fazla kitab bulunabilir.
 
 Java Öğreniyorum --> Yazılım
 Hibernate Öğreniyorum --> Yazılım 
 
 şeklinde...
 

@ManyToMany anotasyonuyla  Set<Category6> categories = new HashSet<Category6>();
şeklinde yaptığımız tanımlamayla "CATEGORY6" ve "PRODUCT6" ilişkisini kurmuş olduk.


 @JoinTable anotasyonu ile ilişkiyi daha anlaşılır hale geirdik.
 @JoinTable(
    name = "PRODUCT_CATEGORY_RELATION_6",
    joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID"),
    inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID"))

üstteki tanım ile 
"PRODUCT_CATEGORY_RELATION_6" adında bir ilişki tablosu oluşturduk. 
Bu tabloda "PRODUCT_ID" ve "CATEGORY_ID" sütununu oluşturarak aradaki ilişkiyi bu sütünlara taşıdık.



NOT : Eğer  @JoinTable anotasyonunu kullanmasaydık,
Hibernate iliişkili değişken isimlerinden bir tablo üretecekti. Yine değişken isimleriyle ilişkili olarak tablo sütunlarını oluşturacaktı.
ilişki tablosunun adı  "PRODUCT6_PRODUCT_CATEGORY6" şeklinde olacaktı.
bu tabloda   "PRODUCT6_ID"  ve "categories_ID" adında iki sutun bulunacaktı.

bu açıklamayı daha iyi anlamak için @JoinTable anotasyonunu kaldırarak  Run6.java'yı çalıştırarak sonucunu DB den  görebilirsiniz.