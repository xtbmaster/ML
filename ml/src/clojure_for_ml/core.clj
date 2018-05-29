(ns clojure-for-ml.core
  (:use [clojure.core.matrix]))

(def ma (matrix [[0 1 2] [3 4 5]]))

(pm ma)

(comment
  (use '(incanter core stats charts io))
  (view (histogram (sample-normal 1000))))


(def tra)
