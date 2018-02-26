(ns hacker-rank-clojure.huge-gcd-fp-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.huge-gcd-fp :refer :all]))

(deftest test-huge-gcd-fp
  (testing "sample I/O."
    (is (= 60 (huge-gcd-fp [2 2 3 3 25]
                           [8 1 6 170]))
        (= 1 (huge-gcd-fp [1 2 4 8 32 64 128 256 512 1024 2048 4096 8192]
                          [1 3 9 27 81 243 729 2187 6561])))))
