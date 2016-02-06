
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

##Redis performance
OVERALL], RunTime(ms), 1374.0	
[OVERALL], Throughput(ops/sec), 7278.020378457059	
[CLEANUP], Operations, 1.0	
[CLEANUP], AverageLatency(us), 3.0	
[CLEANUP], MinLatency(us), 3.0	
[CLEANUP], MaxLatency(us), 3.0	
[CLEANUP], 95thPercentileLatency(us), 3.0	
[CLEANUP], 99thPercentileLatency(us), 3.0	
[INSERT], Operations, 10000.0	
[INSERT], AverageLatency(us), 126.3878	
[INSERT], MinLatency(us), 74.0	
[INSERT], MaxLatency(us), 87039.0		
[INSERT], 95thPercentileLatency(us), 183.0	
[INSERT], 99thPercentileLatency(us), 295.0	
[INSERT], Return=OK, 10000		

