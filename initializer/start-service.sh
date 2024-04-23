#!/bin/bash

sh build.sh

docker-compose down
docker system prune -f
docker kill $(docker ps -q)

cd ./docker

docker-compose up -d --build