FROM ubuntu:latest
LABEL authors="davil"

ENTRYPOINT ["top", "-b"]