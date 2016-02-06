include ../Makefile.config

all:
	$(THRIFT_DIR)/bin/thrift -gen java mapkeeper.thrift
	mvn clean dependency:copy-dependencies package

clean:
	cd gen-java && mvn clean
