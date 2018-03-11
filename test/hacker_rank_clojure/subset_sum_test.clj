(ns hacker-rank-clojure.subset-sum-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.subset-sum :refer :all]))

(deftest test-subset-sum
  (testing "sample I/O."
    (is (= 1 (subset-sum [12 10 8 4] 4))
        (= 2 (subset-sum [12 10 8 4] 13))
        (= 3 (subset-sum [12 10 8 4] 30))
        (= -1 (subset-sum [12 10 8 4] 100)))))
