# Açıklamalar : #

* @Temporal ile  Tarih ve Saat işlemleri yapılır,

    # üç farklı değer alır: #
    * TemporalType.TIMESTAMP
    * TemporalType.TIME
    * TemporalType.DATE

    Her üç SQL veri tipini oluşturmak için Java objesinde  java.util.Date veri tipi kullanılır.

    @Temporal(value = TemporalType.DATE)<br>
    private java.util.Date createDate; <br><br>

    @Temporal(value = TemporalType.TIMESTAMP)<br>
    private java.util.Date createDate2;<br><br>


    @Temporal(value = TemporalType.TIME) <br>
    private java.util.Date createTime;<br><br>


   Temporal value   =  TemporalType.TIMESTAMP ise tarih ve saat bilgisi aynı anda içerir
    ÖRN:2017-07-16 19:06:55

   Temporal value   =  TemporalType.TIME ise sadece saat bilgisi içeriyor demektir
    ÖRN : 19:06:55

   Temporal value   =  TemporalType.DATE ise sadece tarih bilgisi  içeriyor demektir
    ÖRN : 2017-07-16      
