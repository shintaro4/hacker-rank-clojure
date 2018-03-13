(ns hacker-rank-clojure.subset-sum-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.subset-sum :refer :all]))

(deftest test-subset-sum
  (testing "sample I/O."
    (is (= 1 (subset-sum [4 8 10 12] 4))
        (= 2 (subset-sum [4 8 10 12] 13))
        (= 3 (subset-sum [4 8 10 12] 30))
        (= -1 (subset-sum [4 8 10 12] 100)))))
