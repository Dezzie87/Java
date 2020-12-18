# Java'da Değişkenler

> 03/12/2020 Değişkenler Java Repom

Java da değişkenler. Değişken nedir?

Değişken, girdiğimiz değerleri alan veya programın çalışmasıyla bazı değerlerin atandığı veri tutuculardır.

Peki değişkenin tanımı bu ise Java da kullanımı nasıl? Yazımın devamında mevcut.

Öncelikle boş bir proje açalım. karşımızda sadece şu kodlar olsun.

```java
public class Main {

    public static void main(String[] args) {
	
    }
}

```
Ardından da örneklerle devam edelim. Örneğin kullanıcıdan bir veri alacağız ve bunu ekrana yazdıracağız. Nasıl yapacağız peki ne kullanacağız,
Çok kolay olan bu yöntemle yani değişkenlerle. Öncelikle bir yazdırmak için kodlarımızı oluşturmamız lazım.

Hemen süslü parantezin içine şunu yazıyoruz.

```java
        System.out.println("Değer : ");

```

Hemen kodumuzu toparlayalım son hali şu olacaktır.

```java
public class Main {

    public static void main(String[] args) {
        System.out.println("Değer : ");
	
    }
}

```

Tamamdır. Ancak bunu demek için çok erken. :) Bu kodu çalıştırdığımızda sadece bize "Değer :" yazan bir metin verecektir. Ama bizim istediğimiz belirlediğimiz sayıyı yazdırsın. Biz bunu istiyoruz. Onun için ise hemen şunları yapıyoruz.

System.out ile başlayan kodumuzu yazmadan önce veya kodumuzun önüne bir değişken atayacağız. 

İnteger türünde dg adında bir değişken atayacağız ve değeri 15 olmasını istiyoruz. Hemen başlayalım. 

Kodumuz şu olacaktır.
```java
	int dg = 15

```
Ve bu kodu system.out kodumuzun önüne ekledikten sonra ise bu değişkeni yazdırmak için değer den sonra bunu birleştirmeliyiz. Nasıl olacak peki? Devam edelim hemen.
Değişkeni ekledikten sonra kodumuzun tamamı şu olacaktır;

```java
public class Main {

    public static void main(String[] args) {
    	int dg = 10;
        System.out.println("Değer : ");
	
    }
}

```
Şimdi de değer yazısının tırnaklarından sonra +dg yazmamız gerek. ve son hali şu olacaktır;

```java
public class Main {

    public static void main(String[] args) {
    	int dg = 10;
        System.out.println("Değer : "+dg);
	
    }
}

```

Sonunda değişkeni tanımladık ve değer olarak yazdırdık. Peki bunu sadece sayı ile değil. bir string ifade ile nasıl yaparız. O da çok basit. 
Hemen int gb = 10; yazan kodumuzun altına gelip şunu yazalım;
```java
	String mt = "Değer : ";

```

Ve bunu da gelip "Değer : " yazan yeri silip yerine mt yazıyoruz. ve kodumuzun son hali şu oluyor;
```java
public class Main {

    public static void main(String[] args) {
        int dg = 10;
        String mt = "Değer : ";
        System.out.println(mt + dg);

    }
```
ve çıktımız aynen şu şekilde oluyor;
```sh
Değer : 10

Process finished with exit code 0
```

Yazımızda integer ve string türündeki değişkenlerin kullanımını gördük. Esen kalın.
