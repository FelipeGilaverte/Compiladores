#!/bin/bash

while true; do
    if ! read -r linha; then
        break
    fi

    linha_sem_espacos=$(echo "$linha" | tr -d ' \t\r')
    echo "[SCANNER] Linha recebida: '$linha_sem_espacos'"
done
