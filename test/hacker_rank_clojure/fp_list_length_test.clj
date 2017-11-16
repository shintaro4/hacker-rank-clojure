(ns hacker-rank-clojure.fp-list-length-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-list-length :refer :all]))

(deftest test-fp-list-length
  (testing "sample I/O."
    (is (= 10 (fp-list-length [2 5 1 4 3 7 8 6 0 9])))))
