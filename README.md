# Interfaces
Java - Interfaces

Java dilinde nesneleri dünyaya sunmanın bir yoludur.

Sınıflar(class) ile interface arasındaki fark sınıfların içinde tüm metotlar (method) için bir uyarlama/uygulama(implementation)
gerekiyorken bir interface için tanımlama yapmanız yeterli olacak ve sonra davranış biçimini belirlemek adına diğer sınıflar 
içerisinde tanımlamanız yeterli olacaktır.

Interface sınıfının genel özelliklerini sıralayacak olursak;

Kod içerisinde “new” anahtar sözcüğü ile oluşturulamazlar.
Bir sınıf birden fazla interface implemente edebilir.
Implemente edicek sınıflar arasında genelde “can-do” ilişkisi vardır.
Interface içerisine sadece boş method’lar tanımlanabilir.
