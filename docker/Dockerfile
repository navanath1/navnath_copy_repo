FROM git:latest

# Set the source and destination repository URLs
ENV SRC_REPO_URL=https://github.com/Raghuds48/duplicate-repo-history.git

ENV DST_REPO_URL=https://github.com/Raghuds48/D_z.git

# Clone the source repository
RUN git clone --bare $SRC_REPO_URL /src-repo


# Change into the source repository directory
WORKDIR /src-repo

# Add the destination repository as a remote
RUN git push --mirror  $DST_REPO_URl
