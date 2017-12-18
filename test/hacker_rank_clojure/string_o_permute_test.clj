(ns hacker-rank-clojure.string-o-permute-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.string-o-permute :refer :all]))

(deftest test-string-o-permute
  (testing "sample I/O."
    (is (= "badcqpsr"
           (string-o-permute "abcdpqrs"))
        (= "za"
           (string-o-permute "az")))))
