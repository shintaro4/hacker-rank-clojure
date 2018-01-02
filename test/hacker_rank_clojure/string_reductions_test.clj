(ns hacker-rank-clojure.string-reductions-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.string-reductions :refer :all]))

(deftest test-string-reductions
  (testing "sample I/O."
    (is (= "acb"
           (string-reductions "accabb"))
        (= "abc"
           (string-reductions "abc"))
        (= "prq"
           (string-reductions "pprrqq")))))
