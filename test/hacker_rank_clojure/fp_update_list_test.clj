(ns hacker-rank-clojure.fp-update-list-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-update-list :refer :all]))

(deftest test-fp-update-list
  (testing "sample I/O."
    (is (= [2 4 3 1 23 4 54]
           (fp-update-list [2 -4 3 -1 23 -4 -54])))))
