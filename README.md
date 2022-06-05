# AMOGUS 2
**Пошаговый текстовый квест с минимальным графическим интерфейсом и звуком.**

## Команда запуска

В корневой папке amogusjava: java -jar AMOGUS2.jar.

**Требуется Java 8+.**

Альтернативно игра может быть получена из следующего docker образа:
https://drive.google.com/file/d/1SVU4TLZ5LCKGeM5DLSOgfnf_bRzMtHnW/view?usp=sharing
последовательностью команд:
docker load < amogus2image.tar
docker run --name=tmp amogus2image
docker cp tmp:/home/GAME INSTALLDESTINATION
docker rm tmp
