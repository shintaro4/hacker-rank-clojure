(ns hacker-rank-clojure.fp-list-replication-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-list-replication :refer :all]))

(deftest test-fp-list-replication
  (testing "sample I/O."
    (is (= [1 1 1 2 2 2 3 3 3 4 4 4]
           (fp-list-replication 3 [1 2 3 4])))))
