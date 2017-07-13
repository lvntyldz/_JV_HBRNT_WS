**Açıklamalar : **

@SecondaryTable : Bu anotasyonun amacı tablo alanlarını başka tablolarla birleştirilmiş gibi  eşleştirmektir(map)

@SecondaryTable(name="PRODUCT_CATEGORY")
bu kullanım ile PRODUCT_CATEGORY adında bir tablo oluşturduk.



@ManyToOne : İki tablo arasındaki alanları çoktan tek(Birden fazla satırı tek bir satırla) eşleştirmek için kullanılır.
Bunu daha sonra kullanacağız.




@Column : Tablonun secondary tabloda hangi kolonla ilişkilendirileceğini belirtir.

    @Column(table = "PRODUCT_CATEGORY")
    private String category;
Bu kullanımla PRODUCT_CATEGORY tablosunda category kolonu oluşturup Product tablosuna bağladık.