package AppVersionProgram;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainClass {

    public static void main(String[] args) {
        Map<String, List<AppAPI>> appandApiMap = new HashMap<>();
        Map<String, String> apiLatestVersionMap = new HashMap<>();
        //provide the file path
        try (BufferedReader br = new BufferedReader(new FileReader(new File("C:\\workspace1\\JavaBasic\\src\\AppVersionProgram\\APIVersionFile")))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                String[] fileValues = strLine.split(",");
                List<AppAPI> appAPIS = new ArrayList<>();
                //extract the app with its all app version list
                if (!appandApiMap.containsKey(fileValues[0])) {
                    appAPIS.add(new AppAPI(fileValues[1], fileValues[2]));
                    appandApiMap.put(fileValues[0], appAPIS);
                } else {
                    appandApiMap.get(fileValues[0]).add(new AppAPI(fileValues[1], fileValues[2]));
                }

                //extract the latest app version
                if (!apiLatestVersionMap.containsKey(fileValues[1]))
                    apiLatestVersionMap.put(fileValues[1], fileValues[2]);
                else if (Integer.parseInt(apiLatestVersionMap.get(fileValues[1]).toString().substring(2, apiLatestVersionMap.get        (fileValues[1]).toString().length())) < Integer.parseInt(fileValues[2].toString().substring(2, fileValues[2].toString().length()))) {
                    apiLatestVersionMap.put(fileValues[1], fileValues[2]);
                }

            }

            //comparing the appandApiMap app version with apiLatestVersionMap
            List<String> appWithAllLatestApi = new ArrayList<>();
            appandApiMap.forEach((k, v) -> {
                        List<AppAPI> appAPIS = v;
                        AtomicBoolean allAppVersion = new AtomicBoolean(false);
                        for (AppAPI api : appAPIS) {
                            if (apiLatestVersionMap.containsKey(api.getApiName()) && apiLatestVersionMap.get(api.getApiName()).equals(api.getApiVersion()))
                                allAppVersion.set(true);
                            else {
                                allAppVersion.set(false);
                                break;
                            }
                        }
                        if (allAppVersion.get()) {
                            appWithAllLatestApi.add(k);
                        }
                    }

            );

            //output file path
            Path path = Paths.get("C:\\workspace1\\JavaBasic\\src\\AppVersionProgram\\output");
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                appWithAllLatestApi.forEach(s -> {

                    try {
                        writer.write(s +"\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                });
                //writer.write(appWithAllLatestApi.get(0));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class AppAPI {

        String apiName;
        String apiVersion;

        public AppAPI(String apiName, String apiVersion) {
            this.apiName = apiName;
            this.apiVersion = apiVersion;
        }

        @Override
        public String toString() {
            return "AppAPI{" + "apiName='" + apiName + '\'' + ", apiVersion='" + apiVersion + '\'' + '}';
        }

        public String getApiName() {
            return apiName;
        }

        public void setApiName(String apiName) {
            this.apiName = apiName;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }
    }
}

