(ns hacker-rank-clojure.remove-duplicates-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.remove-duplicates :refer :all]))

(deftest test-remove-duplicates
  (testing "sample I/O."
    (is (= "abc" (remove-duplicates [\a \a \b \c]))
        (= "cba" (remove-duplicates [\c \c \b \a \b \a \c \c])))))
