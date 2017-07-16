#Açıklamalar : #

Hibernate bir JPA implementasyonudur.
Java objelerini DB deki tablolara dönüştürür
Java veri tiplerini SQL veri tiplerine dönüştürür
Aynı Java objesini farklı veritabanlarıyla eşleştirebilir. Örn aynı Person.java objesini hem  Postgre de hemde MySQL de ki structur'a(yapı) dönüştürebilir.
select ile birlikte insert,update,delete gibi transactional operasyonlarıda yürütür. Bu sayede geliştirme kolyalığı ve hızı sağlar.
Caching işlemlerini yürütür



@Entity  : Class'ın üstüne yazılır. Bu objenin persistence obje olduğunu belirtmemize yarar.
javax.persistence.Entity   import edilir.

@Id : DB deki uniqueid ye karşılık  gelmesi için kullanılan bir işaretdir. Bu objenin @id olarak işaretlendiği değişken ile eşsiz bir obje olduğunu göstermemize yarar.
