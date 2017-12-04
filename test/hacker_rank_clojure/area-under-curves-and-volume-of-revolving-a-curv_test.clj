(ns hacker-rank-clojure.area-under-curves-and-volume-of-revolving-a-curv-test
  (:require [clojure.test :refer :all]
            [hacker-rank-clojure.area-under-curves-and-volume-of-revolving-a-curv :refer :all]))

(deftest test-area-under-curves-and-volume-of-revolving-a-curv
  (testing "sample I/O."
    (is (= (Math/round 2435300.3)
           (Math/round (summation area 1 4 [1 2 3 4 5] [6 7 8 9 10]))))
    (is (= (Math/round 26172951168940.8)
           (Math/round (summation volume 1 4 [1 2 3 4 5] [6 7 8 9 10]))))))
