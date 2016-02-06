include ../Makefile.config

all:
	$(THRIFT_DIR)/bin/thrift -gen java mapkeeper.thrift
	mvn clean package

clean:
	mvn clean
