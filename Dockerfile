FROM ubuntu:latest
LABEL authors="coder"

ENTRYPOINT ["top", "-b"]