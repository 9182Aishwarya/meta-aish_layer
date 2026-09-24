CC ?=gcc
SRC=main.c student.c Process_student.c
TARGET=../bin/week1_project
default:
	mkdir -p ../bin
	$(CC) $(CFLAGS) $(SRC) -I../include -o $(TARGET) $(LDFLAGS)
clean:
	rm -f $(TARGET)

.PHONY: clean
