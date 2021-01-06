(ns conversor.core
    (:require [conversor.formatador :refer [formatar]]
              [conversor.cambista :refer [obter-cotacao]]
              [conversor.interpretador-de-opcoes :refer [interpretar-opcoes]])
    (:gen-class))

(defn -main 
  [& args]
  (let [{:keys [de para]} (interpretar-opcoes args)]
    (-> (obter-cotacao de para)
        (formatar de para)
        (prn))))
