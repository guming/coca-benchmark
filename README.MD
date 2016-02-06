
##Benchmark Tools with YCSB
pls see more	
https://github.com/brianfrankcooper/YCSB/wiki

##Thrift performance

make run mode=threadpool    # run TThreadPoolServer	
make run mode=nonblocking   # run TNonblockingServer	
make run mode=hsha          # run THsHaServer	
make run mode=selector      # run TThreadedSelectorServer		
make run mode=disruptor      # run TDisruptorServer		
about the DisruptorServer	
https://github.com/xedin/disruptor_thrift_server

###startup stubserver
cd mapkeeper	
make

cd bin	
make run mode=disruptor

###startup client
cd mapkeeper	
./bin/ycsb load mapkeeper -P ../workloads/workloada

