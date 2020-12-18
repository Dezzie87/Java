# Javada-VeriTipleri
> 03/12/2020 Veri Tipleri Repom

Javada temel veri tipleri nelerdir. Kullanımları.

## İlkel Veri Tipleri

### Tam sayılar:

- **Byte**: -128 ve 127 arasında değerler alır. (8 bit)
- **Short**: -32768 ve 32767 arasında değerler alır. (16 bit)
- **Integer**: Orta uzunluktaki sayıları tutmak için kullanılır. En fazla kullanılan veri tipidir. (32 bit)
- **Long**: Çok uzun sayıları tutmak için kullanılır. (64 bit)

### Ondalıklı Sayılar:

- **Float**: Bu tip virgülden sonra 7 haneye kadar yeterli duyarlılıktadır. (Tek duyarlı — 32 bit)
- **Double**: Bu tip virgülden sonra 17 haneye kadar yeterli duyarlılıktadır. (Çift duyarlı — 64 bit)
- **Char**: Javada karakterleri temsil eder. 16 bit yer kaplar.
- **Boolean**: Bu tip sadece True-False değerini alabilir.

### Referans Tipleri
- **Class**
- **Interface**
- **Array**

### Null Tipi
- **Null**: Herhangi bir değere sahip olmama durumuna verilen isimdir.


## **Veri tipleriyle bir örnek;**

```java
public class Main {

    public static void main(String[] args) {
        int myNumber = 143;
        short myShort = 856;
        long myLong = 9032;
        double myDouble = 5.23;
        float myFloat = 342.3f;
        char myChar = 'y';
        boolean myBoolean = false;
        byte myByte = 127;
        String myName = "Z3DX";
        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);
        System.out.println(myName);
    }
}

```
### **Kodu çalıştırdığımızda ise çıkan sonuç aynen şu olacaktır;**

```
143
856
9032
5.23
342.3
y
false
127
Z3DX
```

Bugünku veri tipleri yazım bu kadardı esen kalın..
