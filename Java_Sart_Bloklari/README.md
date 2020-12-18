# Javada Şart Blokları

Java'da şart blokları ve kullanımları hakkındaki yazım
> 04/12/2020 Şart Blokları Java Repom

Bir java uygulaması yazdığımızı farz edelim.(İf koşulunun mantığı tüm programlama dillerinde aynıdır,sadece syntax farklı olabilir). Bu uygulama içinde bir kod bloğunun çalışması için bir şart gerekli diyelim. Örneğin çarpma işlemi yapacağız klavyeden girilen bir sayıyı 5 ile çarpacağız, ama girilen sayının 0’dan büyük olmasını istiyoruz. Bu ve buna benzer durumlarda kullanılan if koşulunun kullanımına geçmeden önce if koşulunu oluştururken sıkça kullanacağımız karşılaştırma operatörlerinden bahsedeceğim.

Örneğin A=5, B=7 değerleri olsun,

Operatör	Açıklama/Örnek Kullanım
 == (eşit)	İki değer eşitse true, değilse false
(A==B) => false

 != (eşit değil)	İki değer eşit değilse true, eşitse false
(A!=B) => true

 > (büyüktür)	ilk değer ikincisinden büyükse true,değilse false
(A>B) => false

 < (küçüktür)	ilk değer ikincisinden küçükse true, değilse false
(A<B) => true

 >= (büyük eşitse)	ilk değer ikincisinden büyük veya eşitse true,değilse false
(A>B) => false

 <= (küçük eşitse)	ilk değer ikincisinden küçük veya eşitse true,değilse false
(A<B) => true

Yukarıdaki operatörleri if koşullarını oluştururken kullanacağız. Bunlara ek olarak string karşılaştırmaları yapacağımız .equals methodu bulunmaktadır.

Örn:
```java
String x = "Z3DX";
String y = "Software";
 
if(x.equals(y)){ //return false çünkü farklı stringler
 
}
```

**Koşul sağlayan durum**
```java
int x = 3;
 
if(x>0){ // x>0 koşulu true döneceği için
 
int z = x*5;
 
System.out.println("z değeri : "+z);
 
}
 
//konsol çıktısı : z değeri :15
```

**Koşul sağlamayan durum**
```java
int x = 0;
 
if(x>0){ // x>0 koşulu false döneceği için
 
int z = x*5;
 
System.out.println("z değeri : "+z);
 
}
 
//Herhangi konsol çıktısı olmuyacaktır.
```

Yukarıda gördüğünüz gibi x’imiz 0 olduğu için x>0 koşulu false dönecektir. Yani if bloğundaki kodun çalışabilmesi için if koşulunun true olması gerekmektedir. Aslında if(true)  ise if bloğundaki kodlar çalışır.

Peki diyelim ki if koşulu sağlanamazsada başka bir kod bloğu çalıştırmak istiyorsak, yani yukarıdaki örnekten yola çıkarak x’imiz 0 dan büyük değilse başka bir işlem yaptırmak istiyorsak, bu durumda else bloğu çalışacaktır. Zaten yapı genel olarak if-else olarak kullanılır. Yani koşul sağlanırsa if bloğu içindeki kodlar çalışır, sağlanmazsa else bloğu içindeki kodlar çalışır.

Yukarıda if else yapısının dışında birden çok kontrol sağlayacağımız if – else if – else yapımızda bulunmaktadır. Onuda aşağıdaki kod ile anlatmaya çalışacağım.

```java

int x = 55;
 
if(x>90){ 
   System.out.println("x 90'dan büyüktür");
 
}else if(x>=80){ 
   System.out.println("x 90 ile 80 arasında");
 
}else if(x>=70){ 
   System.out.println("x 80 ile 70 arasında");
 
}else if(x>=60){ 
   System.out.println("x 70 ile 60 arasında");
 
}else if(x>=50){ 
   System.out.println("x 60 ile 50 arasında");
 
}else if(x>=40){ 
   System.out.println("x 50 ile 40 arasında");
 
}else if(x>=30){ 
   System.out.println("x 40 ile 30 arasında");
 
}else if(x>=20){ 
   System.out.println("x 30 ile 20 arasında");
 
}else if(x>=10){ 
   System.out.println("x 20 ile 10 arasında");
 
}else if(x>=0){ 
   System.out.println("x 10 ile 0 arasında");
 
}else{
   System.out.println("x 0 'dan küçüktür");
}
 
//Konsol çıktısı : x 60 ile 50 arasında
```
İf else yapısının genel mantığını anlatmaya çalıştım. Esen kalın.
