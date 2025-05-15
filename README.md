## 📘 Topics Covered

| Topic | Description |
|-------|-------------|
| ✅ Intermediate vs Terminal Operations | Learn the stream processing lifecycle |
| ✅ map(), filter(), flatMap() | Functional-style transformations |
| ✅ collect(), groupingBy(), partitioningBy() | Aggregation and data organization |
| ✅ IntSummaryStatistics | Get count, sum, average, min, and max |
| ✅ Parallel Streams | When and when *not* to use them |
| ✅ Fail-Fast vs Fail-Safe | Understand modification behavior during iteration |



 Intermediate vs Terminal Operations
Intermediate operations (e.g., map(), filter(), sorted()) return a new stream. They're lazy, meaning they don't execute until a terminal operation is called.

Terminal operations (e.g., collect(), forEach(), count()) trigger the stream pipeline and produce a result or side-effect.

📂 File: StreamBasics.java

 map(), filter(), flatMap()
map() — transforms each element (e.g., String to uppercase).

filter() — removes elements based on a condition (e.g., keep only even numbers).

flatMap() — flattens nested structures like List<List<String>> into a single stream.

📂 File: MapFlatMapExample.java

collect(), groupingBy(), partitioningBy()
collect() — terminal operation used to convert stream to List, Set, Map, etc.

groupingBy() — groups elements by a classifier function (e.g., group employees by department).

partitioningBy() — splits data into two groups based on a predicate (e.g., true/false).

📂 File: GroupingAndPartitioning.java

 IntSummaryStatistics
Java 8 provides built-in summary collectors like summarizingInt(), summarizingDouble(), etc.

These return IntSummaryStatistics or DoubleSummaryStatistics containing:

count, sum, min, max, average

📂 File: SummaryStatisticsExample.java

Fail-Fast vs Fail-Safe
Fail-Fast (e.g., ArrayList, HashMap) throws ConcurrentModificationException if modified during iteration.

Fail-Safe (e.g., CopyOnWriteArrayList, ConcurrentHashMap) avoids exceptions by working on a copy of the data.

Important when dealing with concurrency or modifying data during iteration.

📂 File: FailFast.java
📂 File: FailSafe.java
