#first window
cd mapkeeper
make

cd bin
make run mode=disruptor

#second window
cd mapkeeper
./bin/ycsb load mapkeeper -P ../workloads/workloada

