(ns hacker-rank-clojure.lists-nad-gcd-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.lists-and-gcd :refer :all]))

(deftest test-lists-and-gcd
  (testing "sample I/O."
    (is (= {7 1}
           (lists-and-gcd {7 2} {2 2 7 1})))
    (is (= {2 3 3 1 5 4 7 2}
           (lists-and-gcd {2 5 3 1 5 4 7 3 13 1 19 1 23 2 31 1}
                          {2 3 3 2 5 4 7 2 29 1})))
    (is (= {3 2 5 3}
           (lists-and-gcd {2 2 3 2 5 3}
                          {3 2 5 3 11 1})))))
