#startup stubserver
cd mapkeeper	
make

cd bin	
make run mode=disruptor

#startup client
cd mapkeeper	
./bin/ycsb load mapkeeper -P ../workloads/workloada

