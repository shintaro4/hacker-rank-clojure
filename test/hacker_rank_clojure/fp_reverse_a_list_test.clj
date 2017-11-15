(ns hacker-rank-clojure.fp-reverse-a-list-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.fp-reverse-a-list :refer :all]))

(deftest test-fp-reverse-a-list
  (testing "sample I/O."
    (is (= [0 28 4 18 17 26 28 3 22 19]
           (fp-reverse-a-list [19 22 3 28 26 17 18 4 28 0])))))
