FROM jenkins/jenkins:2.482-jdk17
USER root

RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    curl \
    firefox-esr \
    && apt-get clean

#Setup Chrome
RUN wget -q -O - https://dl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && echo "deb [arch=amd64] https://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google-chrome.list \
    && apt-get update \
    && apt-get install -y google-chrome-stable
USER jenkins
RUN jenkins-plugin-cli --plugins "maven-plugin"