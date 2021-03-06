package io.cattle.platform.docker.client;

import org.apache.commons.lang3.StringUtils;

public class DockerImage {

    public static final String DEFAULT_REGISTRY = "index.docker.io";

    public static final String KIND_PREFIX = "docker:";
    
    public static final String SIM_PREFIX = "sim:";

    String fullName, serverAddress;

    public DockerImage(String fullName, String serverAddress) {
        super();
        this.fullName = fullName;
        this.serverAddress = serverAddress;
    }

    public static DockerImage parse(String uuid) {
        if (uuid.startsWith(KIND_PREFIX)) {
            uuid = uuid.substring(KIND_PREFIX.length());
        } else if (uuid.startsWith(SIM_PREFIX)) {
            uuid = uuid.substring(SIM_PREFIX.length());
        }
        String[] hostNameAndRepoName = splitHostName(uuid);
        return new DockerImage(hostNameAndRepoName[1], hostNameAndRepoName[0]);
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getServer() {
        return this.serverAddress;
    }

    public static String[] splitHostName(String name) {
        int i = name.indexOf("/");
        if (i == -1 || (!StringUtils.containsAny(name.substring(0, i), ".:"))
                && !name.substring(0, i).equals("localhost")) {
            return new String[] {DEFAULT_REGISTRY, name};
        }
        return new String[] {name.substring(0, i), name.substring(i+1, name.length())};
    }
}
