(ns building-ml-system-python.web-traffic
  (:require
    [clojure.java.io :as io]
    [clojure.string :as str]))

(->> (line-seq (io/reader "resources/data/web_traffic.tsv")
        (map #(str/split % #"\t"))
        (map #(nth % 0))
        (map #(Integer/parseInt %))
        count))
